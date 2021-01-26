import java.util.Scanner;

class example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("x: ");
        x = input.nextInt();
        System.out.println("y: ");
        y = input.nextInt();

        System.out.printf("%d + %d = %d\n", x, y, (x + y));

        input.close();
    }
}