
import java.util.Scanner;

public class GradeAverage {

    public static void main(String Args[]){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your music grade:");
        int music=input.nextInt();

        System.out.println("Enter your history grade:");
        int history=input.nextInt();

        System.out.println("Enter your math grade:");
        int math=input.nextInt();

        System.out.println("Enter your chemistry grade:");
        int chemistry=input.nextInt();

        System.out.println("Enter your turkish grade:");
        int turkish=input.nextInt();

        System.out.println("Enter your physics grade:");
        int physics=input.nextInt();

        int avg=0;
        avg+=music;
        avg+=history;
        avg+=math;
        avg+=chemistry;
        avg+=turkish;
        avg+=physics;

        avg=avg/6;

        boolean passed=false;

        passed= (avg>=60) ? true:false;


        String result= (passed==true) ? "passed":"failed";

        System.out.println(result);



    }


}
