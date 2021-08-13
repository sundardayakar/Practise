package basiclearning.strings;

import java.util.Scanner;

public class sumOfAlphabets {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the alphabets");
        String input;
        input = Scanner.nextLine();
        int result = 0;
        for (int i = 0; i < input.length(); i = i + 1) {
            char alpha = input.charAt(i);
            int alphaAsNumber = (int) alpha - 96;
            result = result + alphaAsNumber;
        }
        System.out.println("the sum of given alphabets is" + " " + result);

    }
}