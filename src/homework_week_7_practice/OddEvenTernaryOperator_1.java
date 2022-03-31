package homework_week_7_practice;

import java.util.Scanner;

/**
 * *1.write a java program that tells us that input number is odd or even?
 * HINT: use ternary operator(?:)
 */

public class OddEvenTernaryOperator_1 {
    public static void main(String[] args) {
        //Scanner declaration for reading input from consdle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        isItOddOrEvennumber(number);
        //closing the scanner object
        scanner.close();
    }

    //checking the number is even or odd
    public static void isItOddOrEvennumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number ");
    }
}

