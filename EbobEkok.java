import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi girin:");
        int n1 = input.nextInt();
        System.out.print("Ikinci sayiyi girin:");
        int n2 = input.nextInt();

        int min=Math.min(n1,n2);
        int i=1,ebob=1;


        while(i <= min){
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }

        i=1;

        while (i<=n2*n1){
            if(i%n1==0 && i%n2==0){
                break;
            }
            i++;

        }

        System.out.println("Ekok: "+i);


        int ekok=(n1*n2)/ebob;

        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+ekok);


    }


}
