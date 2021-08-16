import java.util.Scanner;


public class PerfectNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        int num = input.nextInt();

        int total=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                total+=i;
            }
        }

        if(total==num){
            System.out.println("Girilen sayi mukemmel sayidir.");
        }
        else{
            System.out.println("Girilen sayi mukemmel sayi degildir.");
        }

    }

}
