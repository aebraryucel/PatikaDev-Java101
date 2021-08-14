import java.util.Scanner;

public class LeapYear {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter year:");
        int year=input.nextInt();

        boolean leap=false;

        if(year%4==0){
            leap=true;
        }
        if(year%100==0){
            if(year%400!=0){
                leap=false;
            }
        }

        if(leap){
            System.out.println(year+" is leap year");
        }
        else {
            System.out.println(year+" is not leap year");
        }

    }
}
