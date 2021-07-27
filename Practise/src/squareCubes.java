import java.util.Scanner;

public class squareCubes {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int givenNumber;
        givenNumber = Scanner.nextInt();
        int square;
        square = givenNumber * givenNumber;
        System.out.println("The square is" + " " + square);
        int cube;
        cube = givenNumber * givenNumber * givenNumber;
        System.out.println("the cube is" + " " + cube);
    }
}
