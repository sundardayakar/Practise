import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        float givenAge;
        givenAge = Scanner.nextFloat();
        if (givenAge < 0) {
            System.out.println("invalid input");
            System.exit(0);
        }
        if (givenAge < 1) {
            System.out.println("newly born");
        } else if (givenAge >= 1 && givenAge < 14) {
            System.out.println("child");
        } else if (givenAge >= 14 && givenAge < 30) {
            System.out.println("young");
        } else if (givenAge >= 30 && givenAge < 60) {
            System.out.println("adult");
        } else if (givenAge >= 60) {
            System.out.println("old");
        }
    }
}
