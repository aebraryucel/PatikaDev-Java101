import java.util.Scanner;

public class TaxiCostCalculator {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter distance(km):");
        double dist=input.nextDouble();

        double price = 10 + dist*2.20;

        if(price>20){
            System.out.println("price is "+price);
        }
        else{
            System.out.println("price is 20");
        }

    }
}
