package basiclearning.general;

import java.util.Scanner;

public class printStars {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int input;
        System.out.println("how many number of lines");
        input = Scanner.nextInt();
        for (int i = input; i >= 1; i = i - 1) {
            for (int j = 1; j <= i; j = j + 1) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
