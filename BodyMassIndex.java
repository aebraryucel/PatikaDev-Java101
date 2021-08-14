import java.util.Scanner;

public class BodyMassIndex {


    public static void main(String Args[]) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter your height(m)");
        double height=input.nextDouble();

        System.out.println("enter your weight(kg)");
        double weight=input.nextDouble();

        double bmi=weight/(height*height);

        System.out.println("Your body mass index is "+bmi);




    }


}
