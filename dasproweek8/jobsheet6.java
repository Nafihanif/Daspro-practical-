package dasproweek6;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
public class jobsheet6{
    public static void main (String [] args){
        Scanner tiu = new Scanner (System.in);
        //input value
        System.out.println("---------------------------------");
        System.out.println("     STUDENT DATA INPUT ");
        System.out.println("---------------------------------");
        System.out.print ("NAME       : ");
        String name = tiu.nextLine();
        System.out.print ("ID NUMMBER : ");
        String id = tiu.nextLine();

        System.out.println("\nSUBJECT 1     : ALGORITHM AND PROGAMMING");;
        System.out.print("MID EXAM SCORE   :");
        double UTS_AlPro = tiu.nextDouble();
        System.out.print("FINAL EXAM SCORE :");
        double UAS_AlPro = tiu.nextDouble();
        System.out.print("ASSIGNMENT SCORE :");
        double Ass_AlPro = tiu.nextDouble();
        
        System.out.println("\nSUBJECT 2     : DATA STRUCTURE");
        System.out.print("MID EXAM SCORE   :");
        double UTS_DatStruc = tiu.nextDouble();
        System.out.print("FINAL EXAM SCORE :");
        double UAS_DatStruc = tiu.nextDouble();
        System.out.print("ASSIGNMENT SCORE :");
        double Ass_DatStruc = tiu.nextDouble();

        //calculate 
        double finalC_AlPro = (0.30 * UTS_AlPro) + (0.40 * UAS_AlPro) + (0.30 * Ass_AlPro);
        double finalC_DatStruc = (0.30 *UTS_DatStruc) + (0.40 * UAS_DatStruc) + (0.30 * Ass_DatStruc);

        //decision logic algorithm and progamming 
        String statusAlpro, statusDatStruc;
        if (finalC_AlPro >= 60 ){
            statusAlpro = "PASSED";
        } else {
            statusAlpro = "NOT PASS";
        }
        //decision logic data structure 
        if (finalC_DatStruc >= 60){
            statusDatStruc = "PASSED";
        } else {
            statusDatStruc = "NOT PASS";
        }

        //convert numeric values ​​to letters
        String letter_grade_alpro , letter_grade_datstruc ;

        //conversion of grades for algorithm and programming subjects
        if (finalC_AlPro > 80 && finalC_AlPro <=100) {
            letter_grade_alpro = "A" ;
        } else if (finalC_AlPro > 73){
            letter_grade_alpro = "B+";
        } else if (finalC_AlPro > 65){
            letter_grade_alpro = "B" ;
        } else if (finalC_AlPro > 60){
            letter_grade_alpro = "C+";
        } else if (finalC_AlPro > 50){
            letter_grade_alpro = "C";
        } else if (finalC_AlPro > 39){
            letter_grade_alpro = "D";
        } else {
            letter_grade_alpro = "E";
        }
       //conversion of grades for algorithm and programming subjects
       if (finalC_DatStruc > 80 && finalC_DatStruc <=100){
            letter_grade_datstruc = "A";
       } else if (finalC_DatStruc > 73){
            letter_grade_datstruc = "B+";
       } else if (finalC_DatStruc > 65){
            letter_grade_datstruc = "B";
       } else if (finalC_DatStruc > 60){
            letter_grade_datstruc = "C+";
       } else if (finalC_DatStruc > 50){
            letter_grade_datstruc = "C";
       } else if (finalC_DatStruc > 39){
            letter_grade_datstruc = "D";
       } else {
            letter_grade_datstruc = "E";
       }

       //calculate the average final grade
       double average_All = (finalC_AlPro + finalC_DatStruc) / 2;
       //determine graduation status
       String graduationStatus;
       if (statusAlpro.equals("PASSED") && statusDatStruc.equals("PASSED")) {
        if (average_All >= 70){
            graduationStatus = "PASSED";
        } else {
            graduationStatus = "NOT PASS (Avarage < 70)";
        }
       } else {
        graduationStatus = "NOT PASS";
       }

       //out put 
       System.out.println("\n\n=======================================");
       System.out.println("       STUDENT DATA INPUT");
       System.out.println("=======================================");
       System.out.println("Name : " + name );
       System.out.println("NIM  : " + id );

       System.out.println("\nSUBJECT 1     : ALGORITHM AND PROGAMMING");;
       System.out.println("MID EXAM SCORE   :" + UTS_AlPro);
       System.out.println("FINAL EXAM SCORE :" + UAS_AlPro);
       System.out.println("ASSIGNMENT SCORE :" + Ass_AlPro);

       System.out.println("\nSUBJECT 2     : DATA STRUCTURE");
       System.out.println("MID EXAM SCORE   :" + UTS_DatStruc);
       System.out.println("FINAL EXAM SCORE :" + UAS_DatStruc);
       System.out.println("ASSIGNMENT SCORE :" + Ass_DatStruc);


       System.out.println("\n\n=======================================");
       System.out.println("       ACADEMIC RESEARCH RESULTS");
       System.out.println("=======================================");
       System.out.println("Name : " + name );
       System.out.println("NIM  : " + id );
       System.out.println("----------------------------------------------------------------------------------------------");

       System.out.printf ("%-25s %-10s %-10s %-10s %-15s %-15s %-10s\n",
       "SUBJECT", "UTS", "UAS", "ASSIGNMENT", "FINAL SCORE", "LETTER GRADE ", "STATUS");
       System.out.println("----------------------------------------------------------------------------------------------");

       System.out.printf("%-25s %-10.2f %-10.2f %-10.2f %-15.2f %-15s %-10s\n",
       "Algorithm and Progamming", UTS_AlPro, UAS_AlPro, Ass_AlPro, finalC_AlPro, letter_grade_alpro, statusAlpro);

       System.out.printf("%-25s %-10.2f %-10.2f %-10.2f %-15.2f %-15s %-10s\n",
       "Data tructure", UTS_DatStruc, UAS_DatStruc, Ass_DatStruc, finalC_DatStruc,letter_grade_datstruc,statusDatStruc );

       System.out.println("----------------------------------------------------------------------------------------------");
       System.out.printf("\nAvarage final grade: %.2f\n", average_All);
       System.out.println("Graduation status   : " + graduationStatus);
       System.out.println("=============================================================================================");

       tiu.close();
    }
}

