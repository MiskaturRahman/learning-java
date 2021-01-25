import java.util.Scanner;

public class Formatting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = input.next();
            int num = input.nextInt();
            // Complete this line
            System.out.printf("%-15s%03d%n", str, num);
        }
        System.out.println("================================");
        input.close();
    }
}
