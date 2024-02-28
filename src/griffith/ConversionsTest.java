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
		//creation of new conversion object to test it's miles to kilometer
		Conversions converter = new Conversions();
		// after convertion, 1 mile should be equal to 1.61 kilometer
		assertEquals(converter.milesToKilometer(1),1.61);
		// after convertion, 34 miles should be equal to 54.72 kilometer
		assertEquals(converter.milesToKilometer(34),54.72);
		// after convertion, 11 miles should be equal to 11.27 kilometer
		assertEquals(converter.milesToKilometer(7),11.27);
	}

	@Test
	void testKilometerToMiles() {
		fail("Not yet implemented");
	}

	@Test
	void testUpperCaseToLowerCase() {
		fail("Not yet implemented");
	}

	@Test
	void testLowerCaseToUpperCase() {
		fail("Not yet implemented");
	}

}
