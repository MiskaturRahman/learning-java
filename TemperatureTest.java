// Create a class named TemperatureTest
public class TemperatureTest {
    // Create a main method to run the program.
    public static void main(String[] args) {
        System.out.println("Celsius to Fahrenheit:");

        // Create an object named c2fObj1.
        Temperature c2fObj1 = new Temperature();
        c2fObj1.setTemperature(0.00);
        c2fObj1.setScale('C');
        System.out.println(c2fObj1.toString());

        // Create an object named c2fObj2.
        Temperature c2fObj2 = new Temperature('C');
        c2fObj2.setTemperature(-40);
        System.out.println(c2fObj2.toString());

        // Create an object named c2fObj3.
        Temperature c2fObj3 = new Temperature(100.00, 'C');
        System.out.println(c2fObj3.toString());

        // Create an object named f2cObj1.
        System.out.println("\nFahrenheit to Celsius:");
        Temperature f2cObj1 = new Temperature(0);
        f2cObj1.setTemperatureScale(56.00, 'F');
        System.out.println(f2cObj1.toString());

        // Display Comparision.
        System.out.println("\nComparision:");
        System.out.println("c2fObj1 < c2fObj2: " + c2fObj1.lessthan(c2fObj2));
        System.out.println("c2fObj2 = c2fObj3: " + c2fObj1.equals(c2fObj3));
        System.out.println("c2fObj3 > f2cObj1: " + c2fObj3.greaterthan(f2cObj1));
    }
}