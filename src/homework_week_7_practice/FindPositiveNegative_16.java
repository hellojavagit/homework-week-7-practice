package homework_week_7_practice;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class FindPositiveNegative_16 {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //closing the scanner object
        scanner.close();
    }

    //finding the number is positive Negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a Positive number");
        } else if (number < 0) {
            System.out.println(number + " is a Negative Number");
        } else {
            System.out.println(number + " is Zero");
        }
    }
}
