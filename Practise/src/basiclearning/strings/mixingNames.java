package basiclearning.strings;

import java.util.Scanner;

public class mixingNames {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstWord;
        firstWord = Scanner.nextLine();
        System.out.println("Enter second word");
        String secondWord;
        secondWord = Scanner.nextLine();
        System.out.println(firstWord + secondWord);
    }
}
