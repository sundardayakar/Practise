package basiclearning.ArrayProgramms;

import java.util.Scanner;

public class PrintEvenPlacesEvenNumbers {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("how many numbers");
        //taking arraySize from user
        int arraySize;
        arraySize = Scanner.nextInt();
        //declaring the arraySize given by user
        int[] input = new int[arraySize];

        //reading the inputs from user
        System.out.println("enter the numbers");
        for (int i = 0; i < arraySize; i++) {
            input[i] = Scanner.nextInt();
        }
        //checking the array is even
        int sum = 0;
        for (int j = 0; j < arraySize; j++) {
            if (j % 2 == 0) {
                // taking the evenPlace value
                int value = input[j];
                //checking the value taken from evenPlace is even or not
                if (value % 2 == 0) {
                    //adding the value which are even
                    sum = sum + value;
                }
            }
        }
        System.out.println("the sum of even numbers is " + sum);
    }
}
