import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    private static int drawNumber() {
        return new Random().nextInt(101);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int TotalGuess = 0;
        while (true) {
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(input.nextLine());
            TotalGuess++;

            if (guess == numberDrawn) {
                break;
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + TotalGuess);
            } else {
                System.out.println("The number is lesser, guesses made: " + TotalGuess);
            }
        }
        System.out.println("Congratulations, your guess is correct!");

        input.close();
    }
}