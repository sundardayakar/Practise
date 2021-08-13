package basiclearning.charProgramms;

import java.util.Scanner;

public class numberPrint {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        for (int i = 97; i <= 123; i = i + 1) {
            System.out.println((char) i + "=" + i);
        }
        for (int j = 65; j <= 91; j = j + 1) {
            System.out.println((char) j + "=" + j);

        }
    }
}
