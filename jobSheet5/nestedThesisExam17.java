package jobsheet5;
import java.util.Scanner;
public class nestedThesisExam17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String massage = "";

        System.out.print("Has the student been cleared of compensation? (Y/N or yes/no) : ");
        String compensationStatus = sc.nextLine().trim().toLowerCase();
        
        System.out.print("Enter the number of guidance logs with supervisor 1 : ");
        int supervisor1 = sc.nextInt();
        System.out.print("Enter the number of guidance logs with supervisor 2 : ");
        int supervisor2 = sc.nextInt();

        boolean free =compensationStatus.equals("y") ||compensationStatus.equals("yes");

        if (free){
            if (supervisor1 >= 8 && supervisor2 >= 4) {
                massage = "All requirements are met. The student may register for the thesis exam.";
            } else if (supervisor1 < 8 &&supervisor2 < 4){
                massage ="Failed : guidance logs with supervisor 1 are fewer than 8 AND supervisor 2 fewer than 4.";
            } else if (supervisor1 < 8 && supervisor2 >= 4){
                massage ="Failed : Guidance logs with supervisor 1 are fewer than 8.";
            } else if (supervisor1 >= 8 && supervisor2 < 4){
                massage ="Failed : Guidance logs with supervisor 2 are fewer than 4.";
            }
        }else{
            massage = "Failed : The student has not been cleared of compensation. ";
        }

        System.out.println(massage);
        sc.close();
    }
}
