package basiclearning.general;

import java.util.Scanner;

public class sample {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int arraySize;
        arraySize = Scanner.nextInt();
        int[] input = new int[arraySize];


        for (int i = 0; i < arraySize; i++) {
            input[i] = Scanner.nextInt();

        }
        int[] input2 = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {

            input2[i]=Scanner.nextInt();

    }

}
}

