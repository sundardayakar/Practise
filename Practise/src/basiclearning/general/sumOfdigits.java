package basiclearning.general;

import java.util.Scanner;

public class sumOfdigits {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int input;
        input = Scanner.nextInt();
        int sum = 0;
        while (input > 0) {
            int Remainder = 0;
            Remainder = input % 10;
            sum = sum + Remainder;
            input = input / 10;
        }
        System.out.println("the sum of given number is " + sum);
    }
}
