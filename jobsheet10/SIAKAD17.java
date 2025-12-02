package jobsheet10;
import java.util.Scanner;
public class SIAKAD17 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] score = new int[4][3];

        for (int i = 0; i <score.length; i++){
            System.out.println("Enter scores for student #"+ (i+1));

            for (int j = 0; j < score[i].length; j++){
                System.out.print("Course #"+ (j+1) + " score: ");
                score[i][j]= sc.nextInt();
            }
        }
    }
}
