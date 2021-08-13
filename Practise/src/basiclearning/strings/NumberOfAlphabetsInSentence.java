package basiclearning.strings;

import java.util.Scanner;

public class NumberOfAlphabetsInSentence {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the sentence");
        String input;
        input = Scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i = i + 1) {
            if (input.charAt(i) == 'e') {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}