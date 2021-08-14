import java.util.Scanner;


public class PlaneTicketPrice {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        double pricePerKm=0.1;

        System.out.println("enter distance:");
        int dist=input.nextInt();

        if(dist<0){
            System.out.println("Invalid distance length!");
            return;
        }

        System.out.println("enter passenger age:");
        int age=input.nextInt();

        if(age<0){
            System.out.println("Invalid age!");
            return;
        }

        System.out.println("enter trip type. '1' for one-way, '2' for round trip.");
        int type=input.nextInt();

        if(type!=1 && type!=2){
            System.out.println("Invalid type");
            return;
        }

        double cost=dist*pricePerKm;

        if(age<12){
            cost=cost*0.5;
        }
        else if(age>=12 && age<=24){
            cost=cost*0.9;
        }
        else if(age>65){
            cost=cost*0.7;
        }

        if(type==2){
            cost=cost*0.8;
            cost=cost*2;
        }

        System.out.println("Total cost is: "+cost);



















    }
}
