package basiclearning.charProgramms;

import java.util.Scanner;

public class ConversionOfSmallToCapital {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the alphabet");
        char input;
        input = Scanner.nextLine().charAt(0);
        int inputAsNumber = (int) input;
        int result;
        if (inputAsNumber >= 65 && inputAsNumber < 90) {
            result = inputAsNumber + 32;
            System.out.println((char) result);

        } else if (inputAsNumber > 97 && inputAsNumber < 122) {
            int result2;
            result2 = inputAsNumber - 32;
            System.out.println((char) result2);
        }
    }
}
