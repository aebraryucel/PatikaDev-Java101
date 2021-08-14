import java.util.Scanner;

//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapan program

public class PowerOfN {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);
        int i,base,power,total=1;


        System.out.println("Enter base number");
        base = input.nextInt();


        System.out.println("Enter power number");
        power = input.nextInt();


        for(i=0;i<power;i++){
            total*=base;
        }

        System.out.println("Result: "+total);

    }
}
