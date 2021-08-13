package basiclearning.general;

import java.util.Scanner;

public class sumOfInputs {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int input = 0;
        int lessThan50 = 0;
        int greaterThan50 = 0;
        int greaterThan100 = 0;
        System.out.println("enter the values");
        input = Scanner.nextInt();
        while (input != 0) {
            if (input > 100) {
                greaterThan100 = greaterThan100 + 1;
            }
            if (input > 50 && input <= 100) {
                greaterThan50 = greaterThan50 + 1;
            }
            if (input <= 50) {
                lessThan50 = lessThan50 + 1;
            }
            input = Scanner.nextInt();
        }
        System.out.println("numbers greater than 100 are" + " " + greaterThan100);
        System.out.println("numbers greater than 50 are" + " " + greaterThan50);
        System.out.println("numbers less than 50 are" + " " + lessThan50);
    }
}
