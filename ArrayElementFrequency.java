import java.util.Arrays;

public class ArrayElementFrequency {

    //Dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan program.

    public static void main(String[] args) {
        int[] array = {10,20,20,10,10,20,5,20};


        int n=array.length;
        int[] freqArray=new int[n];
        Arrays.fill(freqArray,0);

        System.out.println("Dizi : "+Arrays.toString(array));
        System.out.println("Tekrar Sayıları");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(array[i]==array[j]){
                    if(freqArray[i]!=0){
                        array[j]=-1;
                    }
                    freqArray[i]++;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(array[i]!=-1){
                System.out.println(array[i]+" sayısı "+freqArray[i]+" kere tekrar edildi.");
            }

        }
    }
}
