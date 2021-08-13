package basiclearning.general;

import java.util.Scanner;

public class temperaturesConversions {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        float givenNumber;
        System.out.println("enter the value");
        givenNumber = Scanner.nextFloat();
        int operation;
        System.out.println("1 basiclearning.general.celsius to farenheit,2 farenheit to basiclearning.general.celsius");
        operation = Scanner.nextInt();
        if (operation > 0 || operation > 2) {
            System.out.println("invalid input");
        }
        if (operation == 1) {
            float temp;
            temp = givenNumber * 9;
            float temp2;
            temp2 = temp / 5;
            float temp3;
            temp3 = temp2 + 32;
            System.out.println("The fahrinhet is" + " " + temp3);
        } else if (operation == 2) {
            float temp;
            temp = givenNumber - 32;
            float temp2;
            temp2 = temp * 5;
            float temp3;
            temp3 = temp2 / 9;
            System.out.println("The basiclearning.general.celsius is" + " " + temp3);
        }
    }
}
