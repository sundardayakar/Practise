package basiclearning.general;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int input;
        input = Scanner.nextInt();
        int temp;
        int reverseNumber = 0;

        temp = input;
        while (input > 0) {
            int remainder;
            remainder = input % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            input = input / 10;
        }
        if (temp == reverseNumber) {
            System.out.println("it is palindrome number");
        } else {
            System.out.println("it is not a palindrome number");
        }
    }
}