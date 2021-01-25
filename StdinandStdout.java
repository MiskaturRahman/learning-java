import java.util.Scanner;

public class StdinandStdout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        double value = input.nextDouble();

        input.nextLine();
        String str = input.nextLine();

        input.close();

        System.out.println("String: " + str);
        System.out.println("Double: " + value);
        System.out.println("Int: " + number);

    }
}
