import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MineSweeper {

    int rowNumber;
    int columnNumber;

    public MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }

    void run(){
        Random rand = new Random();
        Scanner input=new Scanner(System.in);

        int m,n;
        int[][] matrix= new int[rowNumber][columnNumber];
        int mineNumber=(rowNumber*columnNumber)/4;

        int[][] mineCoordinates=new int[2][mineNumber];//2 satırlık matris, her sütun bir mayını temsil eder. 0. satır satır numarasını,1. satır sütun numarasını tutar.

        Arrays.stream(mineCoordinates).forEach(a -> Arrays.fill(a, -1));
        Arrays.stream(matrix).forEach(a -> Arrays.fill(a, -1));

        int placedMines=0;

        while(placedMines!=mineNumber){

           m=rand.nextInt(rowNumber);
           n=rand.nextInt(columnNumber);
           boolean isEmpty=true;

            for(int i=0;i<mineNumber;i++){
               if(mineCoordinates[0][i]==m && mineCoordinates[1][i]==n){
                    isEmpty=false;
               }

            }

            if(isEmpty){
               mineCoordinates[0][placedMines]=m;
               mineCoordinates[1][placedMines]=n;
               placedMines++;
            }

        }

        System.out.println("Mayınların Konumu");

        boolean isMine=false;

        for(int i=0;i<rowNumber;i++){
            for(int j=0;j<columnNumber;j++){
                for(int k=0;k<mineNumber;k++){
                    if(mineCoordinates[0][k]==i && mineCoordinates[1][k]==j){
                        System.out.print("* ");
                        isMine=true;
                    }
                }
                if(isMine){
                    isMine=false;
                }
                else{
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }



        System.out.println("=================================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");


        boolean isGameOver=false;
        int successfulMoveCounter=0;
        int neededSuccessfulMoveNumber=(columnNumber*rowNumber)-mineNumber;

        while(!isGameOver){

            for(int i=0;i<rowNumber;i++){
                for(int j=0;j<columnNumber;j++){
                    if(matrix[i][j]==-1){
                        System.out.print("- ");
                    }
                    else{
                        System.out.print(matrix[i][j]+" ");
                    }
                }
                System.out.println("");
            }

            System.out.println("Satır Giriniz : ");
            m=input.nextInt();

            System.out.println("Sütun Giriniz : ");
            n=input.nextInt();

            if(checkCoordinate(m,n,mineCoordinates)){
                isGameOver=true;
                System.out.println("Mayına Bastınız! Oyun Sonu.");
            }
            else{
                matrix[m][n]=calculatePoint(m,n,mineCoordinates);
                successfulMoveCounter++;
            }


            if(successfulMoveCounter==neededSuccessfulMoveNumber){
                System.out.println("Tebrikler oyunu Kazandınız!!");
                for(int i=0;i<rowNumber;i++){
                    for(int j=0;j<columnNumber;j++){
                        if(matrix[i][j]!=-1){
                            System.out.print(matrix[i][j]+" ");
                        }
                        else{
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                }
                break;
            }

        }

    }

    private boolean checkCoordinate(int m, int n, int[][] mineCoordinates) {

        if(m>=rowNumber || n>=columnNumber || n<0 || m<0){
            return false;
        }

        for(int k=0;k<mineCoordinates[0].length;k++){
            if(mineCoordinates[0][k]==m && mineCoordinates[1][k]==n){
                return true;
            }
        }
        return false;
    }

    private int calculatePoint(int m, int n,int[][] mineCoordinates) {
        int point=0;

        if(checkCoordinate(m+1,n,mineCoordinates)){
            point++;
        }
        if(checkCoordinate(m,n+1,mineCoordinates)){
            point++;
        }
        if(checkCoordinate(m+1,n+1,mineCoordinates)){
            point++;
        }
        if(checkCoordinate(m-1,n,mineCoordinates)){
            point++;
        }
        if(checkCoordinate(m,n-1,mineCoordinates)){
            point++;
        }
        if(checkCoordinate(m-1,n-1,mineCoordinates)){
            point++;
        }
        if(checkCoordinate(m+1,n-1,mineCoordinates)){
            point++;
        }
        if(checkCoordinate(m-1,n+1,mineCoordinates)){
            point++;
        }
        return point;
    }
}
