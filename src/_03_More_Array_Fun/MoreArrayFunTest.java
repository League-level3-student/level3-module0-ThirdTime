package _03_More_Array_Fun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoreArrayFunTest {

	// ARRAY STRING PRINTER

	@Test
	public void arrayPrinterWorks_fourStrings() {
		String[] array = { "blue", "cello", "cactus", "electric" };
		String allValues = MoreArrayFun.stringArrayPrinter(array);
		assertEquals("blue, cello, cactus, electric", allValues);

	}

	@Test
	public void arrayPrinterWorks_twoStringsWithSpaces() {

		String[] arrayTwo = { "snow leopard enclosure", "bean paste candy" };
		String allValuesTwo = MoreArrayFun.stringArrayPrinter(arrayTwo);
		assertEquals("snow leopard enclosure, bean paste candy", allValuesTwo);

	}

	@Test
	public void arrayPrinterWorks_lotsOfStrings() {
		String[] arrayThree = { "straw", "velvet", "chocolate", "chrome", "buttons", "orange juice", "mediterranian",
				"sample", "green", "silt", "carpet", "paw print", "soft", "ingenuity", "clamshell", "pink",
				"difficult" };
		String allValuesThree = MoreArrayFun.stringArrayPrinter(arrayThree);
		assertEquals(
				"straw, velvet, chocolate, chrome, buttons, orange juice, mediterranian, sample, green, silt, carpet, paw print, soft, ingenuity, clamshell, pink, difficult",
				allValuesThree);
	}

	@Test
	public void arrayPrinterWorks_blankString() {
		String[] arrayFour = { "" };
		String allValuesFour = MoreArrayFun.stringArrayPrinter(arrayFour);
		assertEquals("", allValuesFour);
	}

	// EVEN STRING PRINTER

	@Test
	public void evenPrinterWorks_fourStrings() {
		String[] array = { "treetop", "snout", "stoplight", "enigma" };
		String allValues = MoreArrayFun.stringArrayEvenIndexPrinter(array);
		assertEquals("snout, enigma", allValues);

	}

	@Test
	public void evenPrinterWorks_sevenStrings() {
		String[] array2 = { "strong", "fermenting", "glass", "crunchy", "smooth", "sweet", "rare" };
		String allValuesForArray2 = MoreArrayFun.stringArrayEvenIndexPrinter(array2);
		assertEquals("fermenting, crunchy, sweet", allValuesForArray2);
	}

	@Test
	public void evenPrinterWorks_oneString() {
		String[] array3 = { "worm" };
		String allValuesFor3 = MoreArrayFun.stringArrayEvenIndexPrinter(array3);
		assertEquals("", allValuesFor3);
	}

	@Test
	public void evenPrinterWorks_blankString() {
		String[] arrayFour = { "" };
		String allValuesFour = MoreArrayFun.stringArrayEvenIndexPrinter(arrayFour);
		assertEquals("", allValuesFour);
	}

	// REVERSE STRING PRINTER

	@Test
	public void reversePrinterWorks_fourStrings() {
		String[] array = { "star", "cheese", "twelve", "ashes" };
		String allValues = MoreArrayFun.stringArrayReverseOrderPrinter(array);
		assertEquals("ashes, twelve, cheese, star", allValues);

	}

	@Test
	public void reversePrinterWorks_oneString() {
		String[] array2 = { "purple" };
		String allValuesForArrayTwo = MoreArrayFun.stringArrayReverseOrderPrinter(array2);
		assertEquals("purple", allValuesForArrayTwo);

	}

	@Test
	public void reversePrinterWorks_twoStrings() {
		String[] array3 = { "trash", "recycle", "compost" };
		String allValuesForArrayThree = MoreArrayFun.stringArrayReverseOrderPrinter(array3);
		assertEquals("compost, recycle, trash", allValuesForArrayThree);

	}

	@Test
	public void reversePrinterWorks_blankString() {
		String[] arrayFour = { "" };
		String allValuesFour = MoreArrayFun.stringArrayReverseOrderPrinter(arrayFour);
		assertEquals("", allValuesFour);
	}

}
