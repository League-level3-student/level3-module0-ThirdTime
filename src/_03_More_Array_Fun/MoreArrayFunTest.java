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

		String[] array = { "snow leopard enclosure", "bean paste candy" };
		String allValues = MoreArrayFun.stringArrayPrinter(array);
		assertEquals("snow leopard enclosure, bean paste candy", allValues);

	}

	@Test
	public void arrayPrinterWorks_lotsOfStrings() {
		String[] array = { "straw", "velvet", "chocolate", "chrome", "buttons", "orange juice", "mediterranian",
				"sample", "green", "silt", "carpet", "paw print", "soft", "ingenuity", "clamshell", "pink",
				"difficult" };
		String allValues = MoreArrayFun.stringArrayPrinter(array);
		assertEquals(
				"straw, velvet, chocolate, chrome, buttons, orange juice, mediterranian, sample, green, silt, carpet, paw print, soft, ingenuity, clamshell, pink, difficult",
				allValues);
	}

	@Test
	public void arrayPrinterWorks_blankString() {
		String[] array = { "" };
		String allValues = MoreArrayFun.stringArrayPrinter(array);
		assertEquals("", allValues);
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
		String[] array = { "strong", "fermenting", "glass", "crunchy", "smooth", "sweet", "rare" };
		String allValues = MoreArrayFun.stringArrayEvenIndexPrinter(array);
		assertEquals("fermenting, crunchy, sweet", allValues);
	}

	@Test
	public void evenPrinterWorks_oneString() {
		String[] array = { "worm" };
		String allValues = MoreArrayFun.stringArrayEvenIndexPrinter(array);
		assertEquals("", allValues);
	}

	@Test
	public void evenPrinterWorks_blankString() {
		String[] array = { "" };
		String allValues = MoreArrayFun.stringArrayEvenIndexPrinter(array);
		assertEquals("", allValues);
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
		String[] array = { "purple" };
		String allValues = MoreArrayFun.stringArrayReverseOrderPrinter(array);
		assertEquals("purple", allValues);

	}

	@Test
	public void reversePrinterWorks_twoStrings() {
		String[] array = { "trash", "recycle", "compost" };
		String allValues = MoreArrayFun.stringArrayReverseOrderPrinter(array);
		assertEquals("compost, recycle, trash", allValues);

	}

	@Test
	public void reversePrinterWorks_blankString() {
		String[] array = { "" };
		String allValues = MoreArrayFun.stringArrayReverseOrderPrinter(array);
		assertEquals("", allValues);
	}

}
