package basiclearning.charProgramms;

import java.util.Scanner;

public class printCapitalAndSmall {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the Alphabet");
        char input;
        input = Scanner.nextLine().charAt(0);
        int inputAsNumber;
        inputAsNumber = input;

        if (inputAsNumber >= 65 && inputAsNumber < 90) {
            for (int i = (char) inputAsNumber; i <= 90; i = i + 1) {
                System.out.println(i + " " + (char) i);
            }
        } else if (inputAsNumber > 97 && inputAsNumber < 122) {
            for (int J = (char) inputAsNumber; J <= 122; J = J + 1) {
                System.out.println(J + " " + (char) J);
            }
        }
    }
}