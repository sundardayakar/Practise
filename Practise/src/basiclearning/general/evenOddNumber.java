package basiclearning.general;

import java.util.Scanner;

public class evenOddNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int givenNumber;
        givenNumber = Scanner.nextInt();
        int remainder;
        remainder = givenNumber % 2;
        if (remainder == 0) {
            System.out.println("the value is Even Number");
        } else {
            System.out.println("the value is odd number");
        }
    }
}
