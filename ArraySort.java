import java.util.Arrays;
import java.util.Scanner;


public class ArraySort {

    public static void main(String[] args) {

        System.out.println("Dizinin boyutu n : ");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] array=new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+". elemanı : ");
            array[i]=input.nextInt();
        }

        int temp;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[j]<array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
