package basiclearning.charProgramms;

import java.util.Scanner;

public class PrintAsciiValues {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the alphabet");
        char input;
        input = Scanner.nextLine().charAt(0);
        for (int i = (int) input; i <= 122; i = i + 1) {
            System.out.println(i + " " + (char) i);
        }
    }
}
