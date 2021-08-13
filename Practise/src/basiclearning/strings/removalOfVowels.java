package basiclearning.strings;

import java.util.Scanner;

public class removalOfVowels {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String input;
        input = Scanner.nextLine();
        String Consonants = "";
        for (int i = 0; i < input.length(); i = i + 1) {
            if (!(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')) {
                Consonants = Consonants + input.charAt(i);
            }

        }
        System.out.println(Consonants);

    }

}