package basiclearning.strings;

import java.util.Scanner;

public class PrintOppositeAlphabets {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the alphabets");
        String input;
        input = Scanner.nextLine();
        String result = " ";
        for (int i = 0; i < input.length(); i = i + 1) {
            char alpha = input.charAt(i);
            int alphaAsNumber = 219 - (int) alpha;
            result = result + (char) alphaAsNumber;

        }
        System.out.print(result);

    }
}