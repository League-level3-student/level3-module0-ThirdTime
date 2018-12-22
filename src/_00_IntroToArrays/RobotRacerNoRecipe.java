package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotRacerNoRecipe {
	private static int actualWinner;
	private static int userBetWinner;
	private static int usersNumOfRobots;

	public static void main(String[] args) {
		Robot[] robotList;
		final int MAX_NUM_ROBOTS = 9;
		final int MIN_NUM_ROBOTS = 1;
		Random randNum = new Random();

		String userResponse = JOptionPane.showInputDialog("How many robots do you want to race? (Between 1-9 robots, please.)");
		try {
			usersNumOfRobots = Integer.parseInt(userResponse);
		} 	catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Letters are not acceptable values. Defaulting to 5 robots.");
			usersNumOfRobots = 5;
		}

		while (usersNumOfRobots > MAX_NUM_ROBOTS || usersNumOfRobots < MIN_NUM_ROBOTS) {
			userResponse = JOptionPane.showInputDialog("This is an invalid value. Please enter a number from 1 to 9.");
			usersNumOfRobots = Integer.parseInt(userResponse);
		}

		robotList = new Robot[usersNumOfRobots];

		String userAnswer = JOptionPane.showInputDialog("Now place your bets! (Enter the number of the robot that you think will win the race)");
		userBetWinner = Integer.parseInt(userAnswer) - 1;

		for (int i = 0; i < robotList.length; i++) {
			robotList[i] = new Robot();
			if (usersNumOfRobots <= 5) {
				robotList[i].moveTo((i + 1) * 130, 500);
			}
			if (usersNumOfRobots > 5) {
				robotList[i].moveTo((i * 90), 500);
			}
			robotList[i].setPenColor(randNum.nextInt(255), randNum.nextInt(255), randNum.nextInt(255));
			robotList[i].penDown();
			robotList[i].setSpeed(10);
		}

		while (!robotWonRace(robotList)) {
			for (int i = 0; i < robotList.length; i++) {
				robotList[i].move(randNum.nextInt(70));
			}
		}
	}

	public static boolean robotWonRace(Robot[] robotList) {
		for (int i = 0; i < robotList.length; i++) {
			if (robotList[i].getY() < 30) {
				robotList[i].sparkle();
				robotList[i].turn(-360);
				actualWinner = i;
				checkWinner();
				return true;
			}
		}
		return false;
	}

	public static void checkWinner() {
		if (userBetWinner == actualWinner) {
			JOptionPane.showMessageDialog(null, "Congrats, your robot won the race!");
		} else {
			JOptionPane.showMessageDialog(null, "Your robot didn't win the race.");
		}
	}

}
