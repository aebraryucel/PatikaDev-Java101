import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        double number1,number2,result;
        byte choice;

        System.out.println("enter number1:");
        number1=input.nextDouble();

        System.out.println("enter number2:");
        number2=input.nextDouble();

        System.out.println("1-Add\n2-Sub\n3-Mul\n4-Div\n");
        choice=input.nextByte();

        switch (choice){
            case 1:
                result=number1+number2;
                System.out.println("Result: "+result);
                break;
            case 2:
                result=number1-number2;
                System.out.println("Result: "+result);
                break;
            case 3:
                result=number1*number2;
                System.out.println("Result: "+result);
                break;
            case 4:
                result=number1/number2;
                System.out.println("Result: "+result);
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }




}
