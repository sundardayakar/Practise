package basiclearning.ArrayProgramms;

import java.util.Scanner;

public class PrintPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers");
        int totalSize = scanner.nextInt();

        int[] input = new int[totalSize];

        System.out.println("enter the numbers");

        for (int i = 0; i < totalSize; i++) {
            input[i] = scanner.nextInt();
        }
        for (int i = 0; i < totalSize; i++) {
            if (input[i] > 0) {
                System.out.println(input[i]);
            }
        }
    }
}