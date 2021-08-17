import java.util.Scanner;

//Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan program.

public class PalindromeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();

        isPalindrome(n);

    }

    static void isPalindrome(int n){
        int digitCount=0;
        int number=n;
        int n_=n;
        int reverseNumber=0;
        int digit;

        while(number!=0){
            number=number/10;
            digitCount++;
        }

        for(int i=digitCount-1;i>=0;i--){
            digit=n%10;
            n=n/10;
            reverseNumber+=digit*(Math.pow(10,i));
        }

        if(reverseNumber==n_){
            System.out.println("Girilen sayi palindrom sayidir.");
        }
        else{
            System.out.println("Girilen sayi palindrom sayi degildir.");
        }

    }
    }
