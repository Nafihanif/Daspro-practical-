package jobsheet9;
import java.util.Scanner;
public class arrayAvarageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] score =new int [10];
        double total = 0;
        double avarage ;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + ( i + 1 ) +": ");
            score [i] = sc.nextInt();
        } 
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        avarage = total/score.length;
        System.out.println("the class avarage score is : " + avarage );
    }
    
}
