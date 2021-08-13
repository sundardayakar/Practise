package methodslearning;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        int cp = readInput("cost price");
        int sp = readInput("selling price");
        int resp = checkingProfitLoss(cp, sp);
        if (resp == 1) {
            printingResult("You got profit");
        } else if (resp == 2) {
            printingResult("you got loss");
        } else {
            printingResult("No profit no loss");
        }

    }

    public static int readInput(String requirement) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the " + requirement);
        int number = Scanner.nextInt();
        return number;
    }

    public static int checkingProfitLoss(int costPrice, int sellingPrice) {
        if (costPrice < sellingPrice) {
            return 1;
        } else if (costPrice > sellingPrice) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void printingResult(String result) {
        System.out.println(result);
    }
}