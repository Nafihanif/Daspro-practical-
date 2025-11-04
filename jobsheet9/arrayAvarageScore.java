package jobsheet9;
import java.util.Scanner;
public class arrayAvarageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the muber of student : ");
        int c = sc.nextInt();

        int [] score =new int [c];
        double total = 0;
        double avarage ;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + ( i + 1 ) +": ");
            score [i] = sc.nextInt();
        } 
        for (int i = 0; i < score.length; i++) {
            total += score[i];

            if (score[i] > 70){
                System.out.println("Student " + (i+1) +"score :" + score[i]);
                System.out.println("pass");
        }else{
            System.out.println("Student " + (i+1) + "score :" + score[i]);
            System.out.println("failed");
        }
    }

        avarage = total/score.length;
        System.out.println("the class avarage score is : " + avarage );
sc.close();
}
}
