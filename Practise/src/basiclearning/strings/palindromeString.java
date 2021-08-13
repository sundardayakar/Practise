package basiclearning.strings;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the word");
        String input;
        input = Scanner.nextLine();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i = i - 1) {
            reverse = reverse + input.charAt(i);
        }
        if (input.equals(reverse)) {
            System.out.println("it is a palindrome word");
        } else {
            System.out.println("is is not a palindrome word");
        }
    }
}