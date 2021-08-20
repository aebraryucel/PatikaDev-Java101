public class ArrayHarmonicSeries {
//Dizideki sayıların harmonik ortalamasını hesaplayan programı
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int n=numbers.length;
        double total=0;

        for(int i=0;i<n;i++){
            total+=(1.0/numbers[i]);
        }

        System.out.println("Dizinin harmonik ortalaması: "+n/total);

    }
}
