import java.util.Scanner;
import java.util.Arrays;
//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program

public class ClosestMinMax {

    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        System.out.println("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        int upperMin = Integer.MIN_VALUE;
        int lowerMax = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < n) {
                if(i>upperMin){
                    upperMin=i;
                }
            }

            if(i >=n ){
                if(i<lowerMax){
                    lowerMax=i;
                }
            }
        }

        System.out.print("Dizi: { ");
        for (int i : list) {
            System.out.print(i+" ");

        }
        System.out.println("}");
        System.out.println("Girilen değer: " + n);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + lowerMax);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + upperMin);

    }
}
