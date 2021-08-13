package basiclearning.general;

import java.util.Scanner;

public class swappingNumbers {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int firstNumber;
        firstNumber = 8;
        System.out.println(firstNumber);
        int secondNumber;
        secondNumber = 5;
        System.out.println(secondNumber);
        int thirdNumber;
        thirdNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }
}