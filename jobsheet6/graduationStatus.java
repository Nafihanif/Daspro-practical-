package jobsheet6;
import java.util.Scanner;
public class graduationStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====== STUDENT DATA INPUT ======");

        System.out.print("STUDENT NAME : ");
        String name = input.nextLine();
        System.out.print("STUDENT ID   :");
        String ID = input.nextLine();
// input data 
        System.out.println("\n--- Course 1 : Alghorithms & Programming ---");
        System.out.print("Midterm score    :");
        double AMC = input.nextDouble();
        AMC = AMC * 0.3;
        System.out.print("Final exam score :");
        double AFE = input.nextDouble();
        AFE = AFE * 0.4;
        System.out.print("Assignment score :");
        double AAS = input.nextDouble();
        AAS = AAS * 0.3;

        System.out.println("\n--- Course 2 : Data structures ---");
        System.out.print("Midterm score    :");
        double DMC = input.nextDouble();
        DMC = DMC * 0.3;
        System.out.print("Final exam score :");
        double DFE = input.nextDouble();
        DFE =DFE * 0.4;
        System.out.print("Assignment score :");
        double DAS = input.nextDouble();
        DAS =DAS * 0.3;
// calculate 
        double finalA, finalB;
        String letA, letB;

        finalA = AMC + AFE + AAS;
        finalB = DMC + DFE + DAS;

        if (finalA > 80 && finalA <= 100){ 
            letA = "A";     
        } else if (finalA > 73 && finalA <= 80){
            letA = "B+";
        } else if (finalA > 65 && finalA <= 73 ){
            letA = "B";
        } else if (finalA > 60 && finalA <= 65){
            letA = "C+";
        } else if (finalA > 50 && finalA <= 60){
            letA = "C";
        } else if (finalA > 39 && finalA <= 50){
            letA = "D";
        }else {
            letA = "E";
        }

        if (finalB > 80 && finalB <= 100){ 
            letB = "A";     
        } else if (finalB > 73 && finalB <= 80){
            letB = "B+";
        } else if (finalB > 65 && finalB <= 73 ){
            letB = "B";
        } else if (finalB > 60 && finalB <= 65){
            letB = "C+";
        } else if (finalB > 50 && finalB <= 60){
            letB = "C";
        } else if (finalB > 39 && finalB <= 50){
            letB = "D";
        }else {
            letB = "E";
        }

        String statusA, statusB;
        if (finalA >= 60){
            statusA = "PASS";
        } else{
            statusA ="FAIL";
        }
        if (finalB >= 60){
            statusB = "PASS";
        } else{
            statusB = "FAIL";
        }

        double avarage = ( finalA + finalB ) / 2;
        String finalStatus ;
        if (avarage > 70){
            finalStatus = "PASS";
        } else{
            finalStatus = "FAIL (AVARAGE < 70)";
        }
 
//out put 
        System.out.println("\n\n=========================================");
        System.out.println("              ACADEMIC RESULT            ");
        System.out.println("=========================================");
        System.out.println("NAME       : " + name);
        System.out.println("ID STUDENT : " + ID);

        System.out.println("\nCOURSE 1 : Alghorithms & Programming ");
         System.out.println("Midterm score    : " + (int)AMC);
         System.out.println("Final exam score : " + (int)AFE );
         System.out.println("Assignment score : " + (int)AAS);
         System.out.println("Final score      : " + finalA);
         System.out.println("Grade            : " + letA);
         System.out.println("Status           : " + statusA);

        System.out.println("\nCOURSE 2 : Data Structures ");
         System.out.println("Midterm score    : " + (int)DMC);
         System.out.println("Final exam score : " + (int)DFE);
         System.out.println("Assignment score : " + (int)DAS);
         System.out.println("Final score      : " + finalB);
         System.out.println("Grade            : " + letB);
         System.out.println("Status           : " + statusB);
//summary                                                                                                                                                                                                       
        System.out.println(" Avarage Final score : " + avarage);  
        System.out.println(" Semester status     : " + finalStatus);  

        input.close();
        
    }
    
}
