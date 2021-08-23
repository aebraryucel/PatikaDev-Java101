import java.util.Scanner;

//Çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan program.

public class MatrixTranspose {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Matrisin satır sayısını giriniz : ");
        int m=input.nextInt();

        System.out.println("Matrisin sütun sayısını giriniz : ");
        int n=input.nextInt();

        int[][] matrix=new int[m][n];

        System.out.println("Matrisin elemanlarını giriniz : ");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=input.nextInt();
            }
        }

        System.out.println("Matris : ");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Transpoze : ");

        int[][] transpose=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[i][j]=matrix[j][i];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
