import java.util.Scanner;

public class Horoscopes {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);
        int month,day;

        System.out.println("Enter your birth month as number");
        month=input.nextInt();
        if(month<1 || month>12){
            System.out.println("Invalid entry");
            return;
        }

        System.out.println("Enter your birth day as number");
        day=input.nextInt();

        if(day<1 || day>31){
            System.out.println("Invalid entry");
            return;
        }

        if(month==1){
            if(day<22){
                System.out.println("Capricorn");
            }
            else{
                System.out.println("Aquarius");
            }
        }
        else if(month==2){
            if(day<20){
                System.out.println("Aquarius");
            }
            else{
                System.out.println("Pisces");
            }
        }

        else if(month==3){
            if(day<21){
                System.out.println("Pisces");
            }
            else{
                System.out.println("Aries");
            }
        }


      }
    }
