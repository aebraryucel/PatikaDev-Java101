import java.util.Scanner;

public class EventSuggestion {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("EVENT SUGGESTION ACCORDING TO AIR TEMPERATURE");
        System.out.println("Enter air temperature:");
        int temp=input.nextInt();

        if(temp<5){
            System.out.println("Ski");
        }
        else if(temp>=5 && temp<=15){
            System.out.println("Cinema");
        }
        else if(temp>=16 && temp<=25){
            System.out.println("Picnic");
        }
        else{
            System.out.println("Swimming");
        }

    }
}
