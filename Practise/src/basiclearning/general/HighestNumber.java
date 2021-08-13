package basiclearning.general;

import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the First value");
        int firstNumber;
        firstNumber = Scanner.nextInt();
        System.out.println("Enter the second value");
        int secondNumber;
        secondNumber = Scanner.nextInt();
        System.out.println("Enter the third value");
        int thirdNumber;
        thirdNumber = Scanner.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println("the highest number is" + firstNumber);
            } else {
                System.out.println("the highest Number is" + thirdNumber);
            }
        } else {
            if (secondNumber > thirdNumber) {
                System.out.println("the highest number is" + secondNumber);
            } else {
                System.out.println("the highest number is" + thirdNumber);
            }
        }
    }
}