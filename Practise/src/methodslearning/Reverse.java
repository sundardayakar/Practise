package methodslearning;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int inputs = readingInput();
        int reverse = reverse(inputs);
        printing(reverse);

    }

    public static int readingInput() {
        Scanner Scanner = new Scanner(System.in);
        int input;
        input = Scanner.nextInt();
        return input;


    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        boolean isNegative = number < 0;
        if (isNegative) {
            number = number * -1;
        }
        while (number > 0) {
            int remainder;
            remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number = number / 10;
        }
        if (isNegative) {
            reverseNumber = reverseNumber * -1;
        }
        return reverseNumber;
    }

    public static void printing(int result) {
        System.out.println(result);
    }
}
