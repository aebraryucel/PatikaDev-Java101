import java.util.Scanner;

public class TriangleArea {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter triangle edge1 length:");
        double edge1=input.nextInt();

        System.out.println("Enter triangle edge2 length:");
        double edge2=input.nextInt();

        System.out.println("Enter triangle edge3 length:");
        double edge3=input.nextInt();

        if(edge1+edge2<=edge3 || edge1+edge3<=edge2 || edge2+edge3<=edge1){
            System.out.println("invalid edge lengths.");

        }
        else {
            double u = (edge1 + edge2 + edge3) / 2;

            double area = u * (u - edge1) * (u - edge2) * (u - edge3);
            area = Math.sqrt(area);

            System.out.println("Area of triangle is " + area);
        }


      }
    }
