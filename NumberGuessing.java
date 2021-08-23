import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        System.out.println("0-100 ARASI RASTGELE SAYI TAHMİN ETME\n");

        System.out.println("Lütfen tahmininizi giriniz : ");
        int selected = input.nextInt();

        while(selected>=100 || selected<=0){
            System.out.println("Hatalı giriş, lütfen 0-100 aralığında bir sayı giriniz : ");
            selected = input.nextInt();
        }


        while(selected!=randomNumber){
            if(selected>randomNumber){
                System.out.println("Girilen sayı rastgele sayıdan büyük daha küçük bir sayı giriniz : ");
            }
            else{
                System.out.println("Girilen sayı rastgele sayıdan küçük daha büyük bir sayı giriniz : ");
            }
            selected = input.nextInt();
        }

        System.out.println("Sayiyi doğru tahmin ettiniz!");

    }
}
