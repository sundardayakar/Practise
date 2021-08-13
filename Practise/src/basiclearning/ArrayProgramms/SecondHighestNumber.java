package basiclearning.ArrayProgramms;

import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("how many numbers");
        //creating a variable
        int arraySize;
        arraySize = Scanner.nextInt();

        //creating array to variable
        int[] input = new int[arraySize];

        //taking the inputs from user
        System.out.println("enter the numbers");
        for (int i = 0; i < arraySize; i++) {
            input[i] = Scanner.nextInt();
        }
        //creating 2 temporary variables
        int max1 = 0;
        int max2 = 0;
        for (int j = 0; j < arraySize; j++) {
            //if input is greaterThan max1.
            if (input[j] > max1) {
                //now put the temporary variable value to max2.
                max2 = max1;
                //now put the user input value in max1.
                max1 = input[j];
            } else {
                //if user input is lessThan max1
                if (input[j] < max1) {
                    //put the user input in max2
                    max2 = input[j];
                }
            }
        }
        // print the second highest which is in max2
        System.out.println("the second highest number is " + max2);
    }
}