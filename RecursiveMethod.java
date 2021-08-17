import java.util.Scanner;

//Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

// Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
// Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

public class RecursiveMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();
        int counter=-1;

        pattern(n,true,counter);

    }

    static int pattern(int n,boolean down,int counter) {
        if(counter==0){
         return 0;
        }
        System.out.print(n+" ");

        if(down && n-5<=0){
            return pattern(n-5,false,--counter);
        }
        else if(down && n-5>0){
            return pattern(n-5,true,--counter);
        }
        return pattern(n+5,false,++counter);
    }
}
