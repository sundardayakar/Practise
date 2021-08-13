package basiclearning.charProgramms;

import java.util.Scanner;

public class LogicalCapitalAndSmall {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the Alphabet");
        char input;
        input = Scanner.nextLine().charAt(0);
        int inputAsNumber;
        inputAsNumber = (int) input;
        int end = 0;
        if (inputAsNumber >= 65 && inputAsNumber < 90) {
            end = 90;
        } else if (inputAsNumber > 97 && inputAsNumber < 122) {
            end = 122;
        }
        for (int i = input; i <= end; i = i + 1) {
            System.out.println(i + " " + (char) i);
        }

    }
}
