package basiclearning.ArrayProgramms;

import java.util.Scanner;

public class arithmeticMeanOFInputs {
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
        // creating a variable for sum of inputs
        float sumOfInputs = 0;
        //creating a variable for number of inputs
        float numberOfInputs = 0;
        for (int j = 0; j < arraySize; j++) {
            //sum of given inputs
            sumOfInputs = sumOfInputs + input[j];
            numberOfInputs = arraySize;
        }

        // creating a variable result
        float result;
        // divide the sum of inputs and number inputs
        result = sumOfInputs / numberOfInputs;
        //print the result variable to get arithmetic mean
        System.out.println("the arithmetic mean is " + result);
    }

}


