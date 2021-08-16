import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,num,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        System.out.print("Kac tane sayi gireceksiniz: ");
        n = input.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(i+". sayiyi girin:");
            num = input.nextInt();
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }

        System.out.println("Minimum sayi: "+min);
        System.out.println("Maksimum sayi: "+max);

     }
    }
