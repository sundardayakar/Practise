package methodslearning;

import java.util.Scanner;

public class NumberOFVowels {
    public static void main(String[] args) {
        String input = readingInput();
        int vowelsCount = checkingVowelsContains(input);
        printResult(vowelsCount);

    }


    public static String readingInput() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the alphabets");
        String input = Scanner.nextLine();
        return input;
    }

    public static int checkingVowelsContains(String alphabets) {
        int count = 0;
        for (int i = 0; i < alphabets.length(); i++) {
            if (alphabets.charAt(i) == 'a' || alphabets.charAt(i) == 'e' || alphabets.charAt(i) == 'i' || alphabets.charAt(i) == 'o' || alphabets.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void printResult(int result) {
        System.out.println(result);
    }

}
