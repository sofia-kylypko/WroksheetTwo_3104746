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
		fail("Not yet implemented");
	}

	@Test
	void testMilesToKilometer() {
		fail("Not yet implemented");
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
