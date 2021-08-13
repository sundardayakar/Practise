package basiclearning.strings;

import java.util.Scanner;

public class FindingTheStringInSentence {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the sentence");
        String input;
        input = Scanner.nextLine();
        boolean result;
        result = input.contains("honey");
        System.out.println(result);
    }
}
