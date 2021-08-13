package basiclearning.strings;

import java.util.Scanner;

public class PrintCapitalLetters {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String input;
        input = Scanner.nextLine();
        int alphaAsNumbers;
        int modifiedAlpha;
        String result = "";
        for (int i = 0; i < input.length(); i = i + 1) {
            alphaAsNumbers = (int)input.charAt(i);
            if (alphaAsNumbers >= 97 && alphaAsNumbers <= 122) {
                modifiedAlpha = alphaAsNumbers - 32;
            } else {
                modifiedAlpha = alphaAsNumbers;
            }
            result = result + (char) modifiedAlpha;
        }
        System.out.println(result);
    }
}