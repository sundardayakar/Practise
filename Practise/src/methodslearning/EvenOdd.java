package methodslearning;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        int number = readInput();
        boolean res = evaluateIfEvenOrOdd(number);
        if(res){
            printResult("It is Even number");
        }else {
            printResult("It is odd number");
        }
    }

    public static int readInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        return number;
    }

    public static boolean evaluateIfEvenOrOdd(int num){
        if(num %2 ==0 ){
            return true;
        }else {
            return false;
        }
    }

    public static void printResult(String result){
        System.out.println(result);
    }
}
