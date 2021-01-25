/* Java If-Else
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.

Task 
Given an integer, n, perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.*/

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String str = "";

        if (number % 2 == 1) {
            str = "Weird";
        } else {
            if (number >= 2 && number <= 5) {
                str = "Not Weird";
            } else if (number >= 6 && number <= 20) {
                str = "Weird";
            } else {
                str = "Not Weird";
            }
        }

        System.out.println(str);

        input.close();

    }

}