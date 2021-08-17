import java.util.Scanner;

public class RecursivePrimeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Asalligi kontrol edilecek sayiyi giriniz: ");
        int n = input.nextInt();

        boolean p = isPrime(n,n-1);

        if(p){
            System.out.println("Girilen sayi asal sayidir.");
        }
        else{
            System.out.println("Girilen sayi asal sayi degildir.");
        }

    }

    static boolean isPrime(int n,int m) {
        if(m==1){
            return true;
        }
        if(n%m==0){
            return false;
        }
        return isPrime(n,m-1);
    }
}
