import java.util.Scanner;

public class RecursivePowerOfN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban degeri giriniz: ");
        int base = input.nextInt();

        System.out.print("Us degeri giriniz: ");
        int exp = input.nextInt();

        int r=pow(base,exp);
        System.out.println("Sonuc: "+r);

    }

    static int pow(int base, int exp) {
        if(exp==0){
            return 1;
        }
        return base*pow(base,exp-1);
    }
}
