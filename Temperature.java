// Create a class named Temperature.
public class Temperature {
	// Declare the two instance variables.
	private double temperature;
	private char scale;

	// Create four constructor methods.
	// Create a no-argument constructor.
	public Temperature() {
		// Set to zero degrees Celsius.
		temperature = 0;
		scale = 'C';
	}

	// Create a constructor for the instance variable named scale.
	public Temperature(char scale) {
		this.scale = scale;
		// Assume zero degrees if no value is specified.
		temperature = 0;
	}

	// Create a constructor for the instance variable named temperature.
	public Temperature(double temperature) {
		this.temperature = temperature;
		// Assume Celsius, if no scale is specified
		scale = 'C';
	}

	// Create two parameters constructor for the two instance variables.
	public Temperature(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}

	/********** (1) **********/

	// Create two accessor methods.
	// Create an accessor to return the degrees Celsius.
	public double getCelsius() {
		if (scale == 'C') {
			return temperature;
		} else {
			// Round to the nearest tenth of a degree
			return ((double) (Math.round((5 * (temperature - 32.0) / 9.0) * 10.0)) / 10);
		}
	}

	// Create an accessor to return the degrees Fahrenheit
	public double getFahrenheit() {
		if (scale == 'F') {
			return temperature;
		} else {
			// Round to the nearest tenth of a degree
			return (Math.round((9 * (temperature / 5) + 32) * 10) / 10);
		}
	}

	/********** (2) **********/
	// Create three mutator methods.
	// Create a mutator to set the temperature.
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	// Create a mutator to set the scale
	public void setScale(char scale) {
		this.scale = scale;
	}

	// Create a mutator to set both
	public void setTemperatureScale(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}

	/*********** (3) *********/
	// Create three comparison methods.
	// Create an equals method to test whether
	// two temperatures are equal or not.
	public boolean equals(Object obj) {
		if (obj instanceof Temperature) {
			Temperature t = (Temperature) obj;
			return getCelsius() == t.getCelsius();
		}
		return false;
	}

	// Create a method to test whether one temperature is greater than another.
	public boolean lessthan(Object obj) {
		if (obj instanceof Temperature) {
			Temperature t = (Temperature) obj;
			return getCelsius() > t.getCelsius();
		}
		return false;
	}

	// Create a method to test whether one temperature is less than another.
	public boolean greaterthan(Object obj) {
		if (obj instanceof Temperature) {
			Temperature t = (Temperature) obj;
			return getCelsius() < t.getCelsius();
		}
		return false;
	}

	/************ (4) ***********/
	// Create a suitable toString method.
	public String toString() {
		if (scale == 'C') {
			return String.format("%.1f degrees C = %.1f degrees F", temperature, getFahrenheit());
		} else {
			return String.format("%.1f degrees F = %.1f degrees C", temperature, getCelsius());
		}
	}
}