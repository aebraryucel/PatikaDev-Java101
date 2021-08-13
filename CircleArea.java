import java.util.Scanner;

public class CircleArea {

    public static void main(String Args[]) {

        double pi=3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("enter radius of circle");
        double r=input.nextDouble();

        System.out.println("enter central angle");
        double angle=input.nextDouble();

        double area=(pi*r*r)*angle/360;

        System.out.println("Area of circle part "+area);


      }
    }
