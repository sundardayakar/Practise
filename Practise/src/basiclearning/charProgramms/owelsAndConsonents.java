package basiclearning.charProgramms;

import java.util.Scanner;

public class owelsAndConsonents {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the alphabet");
        char input;
        input = Scanner.nextLine().charAt(0);
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println("it is a vowel");
        } else {
            System.out.println("it is a consonant");
        }
    }
}
