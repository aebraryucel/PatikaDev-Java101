public class PrimeNumbers {
    //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran program.


    public static void main(String[] args) {

        boolean prime=true;

        for(int i=2;i<100;i++){
            for(int j=i-1;j>=2;j--){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }
            prime=true;
        }
     }

    }
