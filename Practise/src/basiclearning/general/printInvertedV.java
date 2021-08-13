package basiclearning.general;

import java.util.Scanner;

public class printInvertedV {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int input;
        System.out.println("enter the number of line");
        input = Scanner.nextInt();
        System.out.println("");
        for (int i = 1; i <= input; i = i + 1) {
            for (int j = input; j >= i; j = j - 1) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k = k + 1) {
                if (k > 1 && k < (i * 2) - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}