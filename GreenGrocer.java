import java.util.Scanner;

public class GreenGrocer {
    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        double pear=2.14,apple=3.67,tomato=1.11,banana=0.95,eggplant=5.00;

        System.out.println("pear weight(kg):");
        double pw=input.nextDouble();

        System.out.println("apple weight(kg):");
        double aw=input.nextDouble();

        System.out.println("tomato weight(kg):");
        double tw=input.nextDouble();

        System.out.println("banana weight(kg):");
        double bw=input.nextDouble();

        System.out.println("eggplant weight(kg):");
        double ew=input.nextDouble();


        double totalPrice=(pear*pw)+(apple*aw)+(tomato*tw)+(banana*bw)+(eggplant*ew);
        System.out.println("Total price is " + totalPrice);

    }

}
