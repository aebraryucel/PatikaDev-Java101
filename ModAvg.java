import java.util.Scanner;
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

public class ModAvg {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number:");
        int n=input.nextInt();

        int i,total=0,count=0;

        for(i=1;i<=n;i++){
            if(i%3==0 && i%4==0){
                total+=i;
                count++;
            }
        }

        int avg=total/count;

        System.out.println("Avg is "+avg);
      }
    }
