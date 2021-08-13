package basiclearning.general;

import java.util.Scanner;

public class febinocciNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int input;
        input = Scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;
        while (thirdNumber <= input) {
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            if (thirdNumber == input) {
                System.out.println("it is a febinocci number");
                System.exit(0);
            }
        }
        System.out.println("it is not a febinocci number");
    }
}
