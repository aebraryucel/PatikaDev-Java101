import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi uzunlugunu giriniz: ");
        int n = input.nextInt();

        int t1=0;
        int t2=1;
        int temp;
        
        System.out.print(t1+" ");
        System.out.print(t2+" ");

        for(int i=0;i<n-2;i++){
            System.out.print((t1+t2)+" ");
            temp=t2;
            t2=t1+t2;
            t1=temp;
        }
    }
}
