import java.util.Scanner;

public class factorsLoop {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int givenNumber;
        System.out.println("enter the number");
        givenNumber = Scanner.nextInt();

        int count = 0;
        for (int a = 1; a <= givenNumber; a = a + 1) {
            if (givenNumber % a == 0) {
                count = count + 1;
            }

        }
        System.out.println("number of factors" + count);
    }
}