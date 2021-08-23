import java.util.Scanner;

public class PalindromicWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Palindromikliği kontrol edilecek kelimeyi giriniz : ");
        String s=input.nextLine();


        boolean isPalinromic=true;
        int l=s.length();

        int j=l-1;
        for(int i=0;i<l;i++){
            if(s.charAt(i)!=s.charAt(j)){
                isPalinromic=false;
            }
            j--;
        }

        if(isPalinromic){
            System.out.println("Kelime palindrom kelimedir.");
        }
        else{
            System.out.println("Kelime palindrom kelime değildir.");
        }
      }
    }
