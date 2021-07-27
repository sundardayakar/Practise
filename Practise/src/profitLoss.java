import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the cost price");
        float costPrice;
        costPrice = Scanner.nextFloat();
        System.out.println("enter the selling price");
        float sellingPrice;
        sellingPrice = Scanner.nextFloat();
        if (costPrice < sellingPrice) {
            System.out.println("profit");
        } else if (costPrice > sellingPrice) {
            System.out.println("loss");
        }
    }
}
