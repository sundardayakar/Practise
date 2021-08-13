package basiclearning.ArrayProgramms;

import java.util.Scanner;

public class CreateSubClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();

        int[] input = new int[sizeOfArray];
        System.out.println("enter the numbers");

        //taking input from user
        for (int i = 0; i < sizeOfArray; i++) {
            input[i] = scanner.nextInt();
        }

        //prints the input to console
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println(input[i]);
        }
    }
}
