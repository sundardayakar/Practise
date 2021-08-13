package basiclearning.general;

import java.util.Scanner;

public class forLoopEvenNumbers {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the number");
        for (int a = 0; a <= 100; a = a + 1) {
            if (a % 2 == 0) {
                System.out.println(a + " ");

            }
        }
    }

}