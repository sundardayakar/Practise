package basiclearning.general;

import java.util.Scanner;

public class railwayTiming {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the 24hours time");
        float givenNumber;
        givenNumber = Scanner.nextFloat();
        if (givenNumber == 0) {
            System.out.println(givenNumber + 12);
            System.exit(0);

        }
        if (givenNumber > 24 || givenNumber < 0) {
            System.out.println("invalid Time");
            System.exit(0);

        }
        System.out.println("Time in 12hours");
        System.out.println(givenNumber - 12);
    }
}
