package basiclearning.strings;

import java.util.Scanner;

public class vowelsInWord {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the word");
        String input;
        input = Scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i = i + 1) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                count = count + 1;

            }

        }
        System.out.println("no of vowels" + " " + count);

    }
}
