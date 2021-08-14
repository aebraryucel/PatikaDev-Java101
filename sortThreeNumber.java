import java.util.Scanner;

public class sortThreeNumber {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number1:");
        int n1=input.nextInt();

        System.out.println("Enter number2:");
        int n2=input.nextInt();

        System.out.println("Enter number3:");
        int n3=input.nextInt();

        if(n1<=n2 && n1<=n3){
            System.out.print(n1+ "<=");
            if(n2<=n3){
                System.out.println(n2+"<="+n3);
            }
            else{
                System.out.println(n3+"<="+n2);
            }
        }
        else if(n2<=n3 && n2<=n1){
            System.out.print(n2+ "<=");
            if(n1<=n3){
                System.out.println(n1+"<="+n3);
            }
            else{
                System.out.println(n3+"<="+n1);
            }
        }
        else{
            System.out.print(n3+ "<=");
            if(n2<=n3){
                System.out.println(n2+"<="+n3);
            }
            else{
                System.out.println(n3+"<="+n2);
            }
        }

    }
}
