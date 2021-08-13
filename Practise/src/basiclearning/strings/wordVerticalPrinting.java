package basiclearning.strings;

import java.util.Scanner;

public class wordVerticalPrinting {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String input;
        input = Scanner.nextLine();
        for (int i = 0; i < input.length(); i = i + 1) {
            System.out.println(input.charAt(i));
        }

    }
}
