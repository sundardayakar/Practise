import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the First value");
        int firstNumber;
        firstNumber = Scanner.nextInt();
        System.out.println("Enter the second value");
        int secondNumber;
        secondNumber = Scanner.nextInt();
        int operation;
        System.out.println("1 addition,2 subtraction,3 multiplication,4 division,5 Remainder");
        System.out.println("select operation");
        operation = Scanner.nextInt();
        if (operation <= 1 || operation > 5) {
            System.out.println("invalid input");
        }
        if (operation == 1) {
            System.out.println(firstNumber + secondNumber);
        } else if (operation == 2) {
            System.out.println(firstNumber - secondNumber);
        } else if (operation == 3) {
            System.out.println(firstNumber * secondNumber);
        } else if (operation == 4) {
            System.out.println(firstNumber / secondNumber);
        } else if (operation == 5) {
            System.out.println(firstNumber % secondNumber);
        }
    }
}

