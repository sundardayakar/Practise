package basiclearning.ArrayProgramms;

import java.util.Scanner;

public class FindTheGivenValueInInput {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("how many number");
        int arraySize = Scanner.nextInt();
        int[] input = new int[arraySize];
        System.out.println("enter the numbers");


        for (int i = 0; i < arraySize; i++) {
            input[i] = Scanner.nextInt();
        }
        System.out.println("enter the number to find");
        int givenNumber = Scanner.nextInt();
        for (int j = 0; j < arraySize; j++) {
            if (input[j] == givenNumber) {
                System.out.println("it is existed");
            }
        }
    }

}


