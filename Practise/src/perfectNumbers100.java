import java.util.Scanner;

public class perfectNumbers100 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("the first perfect 100 numbers are");
        for (int a = 1; a <= 100; a = a + 1) {
            int sum = 0;
            for (int input = 1; input < a; input = input + 1) {
                if (a % input == 0) {
                    sum = sum + input;
                }

            }
            if (a == sum) {
                System.out.println(a);
            }
        }
    }
}
