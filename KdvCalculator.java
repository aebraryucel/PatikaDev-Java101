import java.util.Scanner;

public class KdvCalculator {


    public static void main(String Args[]){

        Scanner input=new Scanner(System.in);


        double kdv;
        double kdv1=0.08;
        double kdv2=0.18;



        System.out.println("Enter price of product:");
        double price=input.nextDouble();
        double newPrice;

        if(price >= 1000){
            kdv=price*kdv1;
            newPrice=price+kdv;

            System.out.println("Price without KDV:"+price);
            System.out.println("KDV:"+kdv);
            System.out.println("Price with KDV:"+newPrice);


        }
        else if(price <1000 && price > 0){
            kdv=price*kdv2;
            newPrice=price+kdv;

            System.out.println("Price without KDV:"+price);
            System.out.println("KDV:"+kdv);
            System.out.println("Price with KDV:"+newPrice);

        }
        else{
            System.out.println("Price must be positive");
        }


    }







}
