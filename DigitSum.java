import java.util.Scanner;

//Bir sayının basamak sayılarının toplamını hesaplayan program.

public class DigitSum {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        int digitCounter=0;


        System.out.println("Enter number");
        int n = input.nextInt();

        int n2=n;

        while(n2!=0){
            n2=n2/10;
            digitCounter++;
        }

        int i,total=0;

        for(i=0;i<digitCounter;i++){
            total+=n%10;
            n=n/10;
        }
        System.out.println(total);

    }
}
