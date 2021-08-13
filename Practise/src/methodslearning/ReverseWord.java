package methodslearning;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        String input = readingInput();
        String ReverseWord = ReverseTheWord(input);
        printing(ReverseWord);
    }

    public static String readingInput() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the word");
        String word = Scanner.nextLine();
        return word;
    }

    public static String ReverseTheWord(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }


    public static void printing(String result) {
        System.out.println(result);
    }
}
