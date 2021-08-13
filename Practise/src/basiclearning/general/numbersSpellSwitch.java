package basiclearning.general;

import java.util.Scanner;

public class numbersSpellSwitch {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input;
        input = Scanner.nextInt();
        switch (input) {
            case 1: {
                System.out.println("one");
                break;
            }
            case 2: {
                System.out.println("two");
                break;
            }
            case 3: {
                System.out.println("three");
                break;
            }
            case 4: {
                System.out.println("four");
                break;
            }
            case 5: {
                System.out.println("five");
                break;
            }
            case 6: {
                System.out.println("six");
                break;
            }
            case 7: {
                System.out.println("seven");
                break;
            }
            case 8: {
                System.out.println("eight");
                break;
            }
            case 9: {
                System.out.println("nine");
                break;
            }
            case 10: {
                System.out.println("ten");
                break;
            }
        }
    }
}
