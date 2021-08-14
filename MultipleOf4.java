import java.util.Scanner;

public class MultipleOf4 {

    //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);
        int n,total=0;

        do{
            System.out.println("Enter number");
            n=input.nextInt();

            if(n%4==0){
               total+=n;
            }
        }while(n%2!=1);

        System.out.println("Result: "+total );
    }

}
