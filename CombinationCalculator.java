import java.util.Scanner;

//Java ile kombinasyon hesaplayan program yazınız.

public class CombinationCalculator {
    
    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);
        int r, n;

        System.out.println("Calculation of Combination(n,r)");

        System.out.println("Enter n");
        n = input.nextInt();
        int n2=n;

        System.out.println("Enter r");
        r = input.nextInt();
        int r2=r;

        int k=n-r;

        int kfact=1,nfact=1,rfact=1;
        int combination;

        while(n!=0){
            nfact*=n;
            n--;
        }

        while(r!=0){
            rfact*=r;
            r--;
        }

        while(k!=0){
            kfact*=k;
            k--;
        }

        combination=nfact/(rfact*(kfact));

        System.out.println("Combination("+n2+","+r2+") :" +combination);

    }
}
