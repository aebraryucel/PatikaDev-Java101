import java.util.Scanner;

//Java ile girilen sayının harmonik serisini bulan program.

public class HarmonicSeries {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int n = input.nextInt();
        double total=0;

        for(int i=1;i<=n;i++){
            total+=(1.0/i);
        }

        System.out.println(total);
    }
    
}
