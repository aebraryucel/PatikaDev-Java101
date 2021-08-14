import java.util.Scanner;

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

public class PowerOf4And5 {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);
        int i,n;

        System.out.println("Enter number");
        n=input.nextInt();

        System.out.println("Power of 4's");
        for(i=1;i<n;i*=4){
            System.out.println(i);
        }

        System.out.println("Power of 5's");
        for(i=1;i<n;i*=5){
            System.out.println(i);
        }
        
    }
}
