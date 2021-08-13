package methodslearning;

import java.util.Scanner;

public class RailwayTiming {
    public static void main(String[] args) {
        int input = readInput();
        boolean response = validatingTheTime(input);
        if (response) {
            printResult("invalid input");
        } else {
            System.out.println("time in 12- hours");
            System.out.println(input - 12);
        }
    }

    public static int readInput() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the 24-hours Time");
        int number = Scanner.nextInt();
        return number;
    }

    public static boolean validatingTheTime(int railwayTiming) {
        if (railwayTiming > 24 || railwayTiming <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void printResult(String result) {
        System.out.println(result);
    }
}
