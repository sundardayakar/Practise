package basiclearning.general;

import java.util.Scanner;

public class primeNumbers100 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i <= 100; i = i + 1) {
            int givenNumber = 0;
            for (givenNumber = i; givenNumber >= 1; givenNumber = givenNumber - 1) {
                if (i % givenNumber == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println(i + "");
            }
        }
    }
}
