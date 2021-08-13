package basiclearning.ArrayProgramms;

import java.util.Scanner;

public class PrintPreviousCountNumbers {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("how many numbers");
        int arraySize;
        arraySize = Scanner.nextInt();
        int[] input = new int[arraySize];
        System.out.println("enter the numbers");
        for (int i = 0; i < arraySize; i++) {
            input[i] = Scanner.nextInt();
        }
        int givenNumber;
        System.out.println("enter the number");
        givenNumber = Scanner.nextInt();

        System.out.println("total number of previous numbers");
        int count = 0;
        for (int j = 0; j < arraySize; j++) {
            if (input[j] < givenNumber) {
                count = count + 1;
            }
        }
        System.out.println(count);

    }
}

