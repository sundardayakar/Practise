import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int input;
        System.out.println("enter the value");
        input = Scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < input; i = i + 1) {
            if (input % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == input) {
            System.out.println("it is a perfect number");
        } else {
            System.out.println("it is not a perfect number");
        }
    }
}
