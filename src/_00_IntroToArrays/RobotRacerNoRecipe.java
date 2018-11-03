package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotRacerNoRecipe {
	static Robot[] robotList = new Robot[5];

	public static void main(String[] args) {

		Random randNum = new Random(100);
		int randomNumber;
		
		JOptionPane.showInputDialog("Place your bets! (Enter the number of robot you think will win the race)");

		for (int i = 0; i < robotList.length; i++) {
			robotList[i] = new Robot();
			robotList[i].moveTo((i + 1) * 130, 400);
			robotList[i].setPenColor(150, 150, 150);
			robotList[i].penDown();
			robotList[i].setSpeed(10);
		}

		while (robotWonRace() == false) {
			for (int i = 0; i < robotList.length; i++) {
				robotList[i].move(randNum.nextInt(30));
			}

		}
	}

	public static boolean robotWonRace() {
		for (int i = 0; i < robotList.length; i++) {
			if (robotList[i].getY() < 30) {
				return true;
			}
		}
		return false;
	}
}
