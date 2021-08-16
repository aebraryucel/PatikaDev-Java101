import java.util.Scanner;

public class InverseTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayini girin: ");
        int num = input.nextInt();
        int n=num;

        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
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
