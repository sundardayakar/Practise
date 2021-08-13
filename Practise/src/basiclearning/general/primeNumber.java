package basiclearning.general;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the value");
        int givenNumber;
        int count = 0;
        givenNumber = Scanner.nextInt();

        for (int i = 1; i <= givenNumber; i = i + 1) {

            if (givenNumber % i == 0) {
                count = count + 1;
            }
        }
        if (count == 2) {
            System.out.print("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }
}
