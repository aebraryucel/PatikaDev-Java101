import java.util.Scanner;

public class Stars {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int n = input.nextInt();

        for (int i = 0; i <n; i++) {

            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        int num=n-1;
        n=n-1;

        for(int i=0;i<num;i++){
            for(int j=0;j<i+2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*n-1;k++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            n--;
            System.out.println("");
        }
    }

}
