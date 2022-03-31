package homework_week_7_practice;

import java.util.Scanner;


/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class OddEven_6 {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();
        OddEven_6 oddEven = new OddEven_6();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number  ");
        // Closing the scanner object
        scanner.close();
    }
    //Checking the odd or even
    public String isItEvenOrOddNumber(int number) {
        if(number%2 == 0) {
            return "Even";
        }else{
            return "Odd";

        }

    }
}
