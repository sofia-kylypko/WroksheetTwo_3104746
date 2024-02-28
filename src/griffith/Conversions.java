package griffith;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	//method to convert given temperature in celsius to Fahrenheit
	public double celsiusToFahrenheit(double tempCelsius) {
		//calculation with usage of formula x*9/5+32
		double rawFahrenheit=(tempCelsius*9/5)+32;
		//format it to limit result to two digits in decimal part
		return Math.round(rawFahrenheit*100.0)/100.0;
	}
	
	//method to convert given temperature in Fahrenheit to celsius
	public double fahrenheitToCelsius(double tempFahrenheit) {
		//calculation with usage of formula (x-32)*5/9
		double rawCelsius=(tempFahrenheit-32)*5/9;
		//format it to limit result to two digits in decimal part
		return Math.round(rawCelsius*100.0)/100.0;
	}
	
	//method to convert given distance from miles to kilometer 
	public double milesToKilometer(double distanceMiles) {
		//calculation with usage of formula x*1.609
		double rawKilometer=distanceMiles*1.609;
		System.out.println(Math.round(rawKilometer*100.0)/100.0);
		//format it to limit result to two digits in decimal part
		return Math.round(rawKilometer*100.0)/100.0;
	}
	
	//method to convert given distance from kilometer to miles
	public double kilometerToMiles(double distanceKilometers) {
		return distanceKilometers;
	}
	
	//method to switch all upper case values to lower case values
	public String upperCaseToLowerCase() {
		return null;
	}
	
	//method to switch all lower case values to upper case values
	public String lowerCaseToUpperCase() {
		return null;
	}
	
}

