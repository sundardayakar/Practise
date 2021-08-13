package basiclearning.general;

import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        float temp;
        System.out.println("enter basiclearning.general.celsius");
        temp = Scanner.nextFloat();
        float temp2;
        temp2 = temp * 9;
        float temp3;
        temp3 = temp2 / 5;
        float temp4;
        temp4 = temp3 + 32;
        System.out.println("The fahrinhet is" + " " + temp4);
    }
}
