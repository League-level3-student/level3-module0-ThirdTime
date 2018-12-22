package _03_More_Array_Fun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoreArrayFunTest {

	@Test
	public void testArrayPrinter() {
		String[] array = {"blue", "cello", "cactus", "electric"};
		String allValues = MoreArrayFun.stringArrayPrinter(array);
		assertEquals("blue, cello, cactus, electric", allValues);
		
		String[] arrayTwo = {"snow leopard enclosure", "bean paste candy"};
		String allValuesTwo = MoreArrayFun.stringArrayPrinter(arrayTwo);
		assertEquals("snow leopard enclosure, bean paste candy", allValuesTwo);
		
		String[] arrayThree = {"straw", "velvet", "chocolate", "chrome", "buttons", "orange juice", "mediterranian", "sample", "green", "silt", "carpet", "paw print", "soft", "ingenuity", "clamshell", "pink", "difficult"};
		String allValuesThree = MoreArrayFun.stringArrayPrinter(arrayThree);
		assertEquals("straw, velvet, chocolate, chrome, buttons, orange juice, mediterranian, sample, green, silt, carpet, paw print, soft, ingenuity, clamshell, pink, difficult", allValuesThree);
	}
	
	@Test
	public void testEvenIndexPrinter() {
		String[] array = {"treetop", "snout", "stoplight", "enigma"};
		String allValues = MoreArrayFun.stringArrayEvenIndexPrinter(array);
		assertEquals("snout, enigma", allValues);
	}
	
	@Test
	public void testReverseIndexPrinter() {
		String[] array = {"star", "cheese", "twelve", "ashes"};
		String allValues = MoreArrayFun.stringArrayReverseOrderPrinter(array);
		assertEquals("ashes, twelve, cheese, star", allValues);
	}

}
