import java.util.Scanner;

public class ClassPassFail {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);
        int totalGrade = 0,counter=0;

        System.out.println("Enter math grade: ");
        int math=input.nextInt();

        System.out.println("Enter physics grade: ");
        int physics=input.nextInt();

        System.out.println("Enter turkish grade: ");
        int turkish=input.nextInt();

        System.out.println("Enter chemistry grade: ");
        int chemistry=input.nextInt();

        System.out.println("Enter music grade: ");
        int music=input.nextInt();

        if(math<=100 && math>=0){
            counter++;
            totalGrade+=math;
        }
        if(physics<=100 && physics>=0){
            counter++;
            totalGrade+=physics;
        }
        if(chemistry<=100 && chemistry>=0){
            counter++;
            totalGrade+=chemistry;
        }
        if(turkish<=100 && turkish>=0){
            counter++;
            totalGrade+=turkish;
        }
        if(music<=100 && music>=0){
            counter++;
            totalGrade+=music;
        }

        int avg=totalGrade/counter;

        if(avg>=55){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }

    }

}
