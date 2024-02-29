package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void testCelsiusToFahrenheit() {
		//creation of new conversion object to test it's celsius to fahrenheit convertion
		Conversions converter = new Conversions();
		// after convertion, 0 degree in celsius will give 32 degree in fahrenheit
		assertEquals(converter.celsiusToFahrenheit(0),32);
		// after convertion, -10 degree in celsius will give 14 degree in fahrenheit
		assertEquals(converter.celsiusToFahrenheit(-10),14);
		// after convertion, 36.6 degree in celsius will give 97.88 degree in fahrenheit
		assertEquals(converter.celsiusToFahrenheit(36.6),97.88);
	}

	@Test
	void testFahrenheitToCelsius() {
		//creation of new conversion object to test it's fahrenheit to celsius convertion
		Conversions converter = new Conversions();
		// after convertion, 78 degree in fahrenheit will give 25.55 degree in celsius
		assertEquals(converter.fahrenheitToCelsius(78),25.56);
		// after convertion, 0 degree in fahrenheit will give -17.77 degree in celsius
		assertEquals(converter.fahrenheitToCelsius(0), -17.78);
		// after convertion, -10 degree in fahrenheit will give -23.33 degree in celsius
		assertEquals(converter.fahrenheitToCelsius(-10), -23.33);
	}

	@Test
	void testMilesToKilometer() {
		//creation of new conversion object to test it's miles to kilometer convertion
		Conversions converter = new Conversions();
		// after convertion, 1 mile should be equal to 1.61 kilometer
		assertEquals(converter.milesToKilometer(1),1.61);
		// after convertion, 34 miles should be equal to 54.72 kilometer
		assertEquals(converter.milesToKilometer(34),54.71);
		// after convertion, 11 miles should be equal to 11.27 kilometer
		assertEquals(converter.milesToKilometer(7),11.26);
	}

	@Test
	void testKilometerToMiles() {
		//creation of new conversion object to test it's kilometer to miles convertion
		Conversions converter = new Conversions();
		// after convertion, 1 kilometer should be equal to 0.62 mile
		assertEquals(converter.kilometerToMiles(1),0.62);
		// after convertion, 13 kilometers should be equal to 8.08 mile
		assertEquals(converter.kilometerToMiles(13),8.08);
		// after convertion, 7 kilometers should be equal to 4.35 mile
		assertEquals(converter.kilometerToMiles(7),4.35);
	}

	@Test
	void testUpperCaseToLowerCase() {
		//creation of new conversion object to test it's string formating convertion
		Conversions converter = new Conversions();
		// after convertion, initial string should be all in upper case
		assertEquals(converter.upperCaseToLowerCase("APPLE"),"apple");
		
		assertEquals(converter.upperCaseToLowerCase("cAn"),"can");
		
		assertEquals(converter.upperCaseToLowerCase("potato"),"potato");
	}

	@Test
	void testLowerCaseToUpperCase() {
		fail("Not yet implemented");
	}

}
