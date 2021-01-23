import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println("Enter the radius of the circle: ");

        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();

        c1.setRadius(radius);
        c1.area();

    }
}