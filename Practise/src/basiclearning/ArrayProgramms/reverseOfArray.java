package basiclearning.ArrayProgramms;

import java.util.Scanner;

public class reverseOfArray {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("how many numbers");
        // creating a variable
        int arraySize;
        arraySize = Scanner.nextInt();
        //creating a array
        int[] input = new int[arraySize];
        System.out.println("enter the numbers");
        //taking inputs from user
        for (int i = 0; i < arraySize; i++) {
            input[i] = Scanner.nextInt();
        }

        int[] result = new int[arraySize];


        //running for loop for reverse the array
        System.out.println("the reverse of a input is");
        for (int j = arraySize - 1; j >= 0; j--) {
            result[j] = input[j];
        }
    }
}
