import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // int a = sc.nextInt();
        // float a = sc.nextFloat();
        // System.out.println("Enter number 2");
        // int b = sc.nextInt();
        // float b = sc.nextFloat();

        // int sum = a +b;
        // float sum = a +b;
        // System.out.println("The sum of these numbers is");
        // System.out.println(sum);
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);//prints true or false
        // String str = sc.next();//prints only one word with no space between
        String str = sc.nextLine();// prints whole line
        System.out.println(str);

    }
}
