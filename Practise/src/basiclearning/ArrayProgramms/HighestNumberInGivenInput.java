package basiclearning.ArrayProgramms;

import java.util.Scanner;

public class HighestNumberInGivenInput {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("how many numbers");

        int sizeOfArray = Scanner.nextInt();
        int[] input = new int[sizeOfArray];

        System.out.println("enter the numbers");

        for (int i = 0; i < sizeOfArray; i++) {
            input[i] = Scanner.nextInt();
        }
        int temp = 0;
        for (int j = 0; j < sizeOfArray; j++) {
            if (input[j] > temp) {
                temp = input[j];
            }
        }
        System.out.println("the highest number is " + temp);
    }
}
