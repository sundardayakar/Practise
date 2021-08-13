package basiclearning.strings;

import java.util.Scanner;

public class logicalPalindrome {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the word");
        String input;
        input = Scanner.nextLine();
        int firstPointer = 0;
        int lastPointer = 0;
        boolean isPalindrome = true;
        while (firstPointer != lastPointer && firstPointer < lastPointer) {
            if (input.charAt(firstPointer) != input.charAt(lastPointer)) {
                isPalindrome = false;
                break;
            } else {
                firstPointer = firstPointer + 1;
                lastPointer = lastPointer - 1;
            }
        }
        System.out.println("it is palindrome");
    }
}
