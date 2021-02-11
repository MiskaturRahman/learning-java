import java.util.Scanner;
import java.util.StringTokenizer;

public class inputExample {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter to numbers on a line: ");
        System.out.println("Place comma between numbers: ");
        System.out.println("extra blank space is okay");
        String inputLine = keyboard.nextLine();

        String delimiter = ", ";
        StringTokenizer numberFactory = new StringTokenizer(inputLine, delimiter);

        String String1 = null;
        String String2 = null;

        if (numberFactory.countTokens() >= 2) {
            String1 = numberFactory.nextToken();
            String2 = numberFactory.nextToken();
        } else {
            System.out.println("Fatal Error.");
            System.exit(0);
        }

        double number1 = Double.parseDouble(String1);
        double number2 = Double.parseDouble(String2);

        System.out.println("Your input ");
        System.out.println(number1 + " and " + number2);

        keyboard.close();
    }
}
