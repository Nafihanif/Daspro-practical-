package jobsheet13;
import java.util.Scanner;
public class studentAdministration {
    // data structure 
    static final int MAX = 100;
    static String[] names = new String[MAX];
    static String[] NIMs = new String[MAX];
    static double[] GPAs = new double[MAX];
    static String[] types = new String[MAX];  
    static int[] incomes = new int[MAX];
    static int total = 0; //sum of data have save 

    // ===== MAIN FUNGSI =====
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while(true) {
        System.out.println("=========================================");
        System.out.println("==== SHCOLARSHIP REGISTRATION SYSTEM ====");
        System.out.println("=========================================");
        System.out.println("1. Add Shcolarship Applicant Data");
        System.out.println("2. Display All Applicants");
        System.out.println("3. Search Applicants by Scholarship Type");
        System.out.println("4. Calculate Avarage GPA by Shcolarship Type ");
        System.out.println("5. Exit ");
        System.out.print("Choose menu (1-5) : ");
        int choice = Integer.parseInt(input.nextLine());

        switch (choice) {
        case 1: addApplicant(input); break;
        case 2: displayApplicants(); break;
        case 3: searchByType(input); break;
        case 4: calcAverageGPA(); break;
        case 5: System.out.println("Goodbye!"); input.close(); return;
        default: System.out.println("Invalid choice.");
          }
        System.out.println();
       }
    } 

    // ===== FUNGSI 1 =====
    // TO ADD SHOLARSHIP APPLICANT DATA

    public static void addApplicant(Scanner input) {
        if(total >= MAX) {System.out.println("strorage full. " );return;}

        System.out.print("Student Name : ");
        String name = input.nextLine();

        System.out.print("NIM : ");
        String NIM = input.nextLine();

        System.out.print("Latest GPA : ");
        double GPA = Double.parseDouble(input.nextLine());

        System.out.print("Scholarship Type (Regular/ Outstanding/ Reshearch) : ");
        String type = input.nextLine();
        
        //validasi type 
        if(!type.equalsIgnoreCase("Regular") &&
           !type.equalsIgnoreCase("Outstanding") &&
           !type.equalsIgnoreCase("Reshearch")){
            System.out.println("Invalid Shcolarship type !");
            return;
           }
        System.out.println("parent's income (maximum 2000000) : "); 
        int income = Integer.parseInt(input.nextLine());

        if (income > 2000000){
            System.out.println("Application rejected because parent's income exceeds the maximum limit.");
            return;
        }
        //save data 
        names[total] = name;
        NIMs[total] = NIM;
        GPAs [total] = GPA;
        types[total] = type;
        incomes [total] = income;
        total++;
        System.out.println("Applicant successfully saved. Total applicants: " + total);
    }

    // ===== FUNGSI 2 =====
    // TO DISPLAY ALL APPLICANTS
    public static void displayApplicants(){
        if (total == 0){
            System.out.println("There is no applicant data yet. ");
            return;
        }
        for (int i = 0; i < total; i++){
            System.out.println("\nApplicant #" + (i + 1));
            System.out.println("Name     : " + names[i]);
            System.out.println("NIM      : " + NIMs[i]);
            System.out.println("GPA      : " + GPAs[i]);
            System.out.println("Type     : " + types[i]);
            System.out.println("Income   : " + incomes[i]);
        }
    } 

    // ===== FUNGSI 3 =====
    // TO SEARCH APPLICANTS BY SCHOLARSHIP TYPE 
    public static void searchByType(Scanner sc) {
        System.out.print("Enter scholarship type: ");
        String searchType = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < total; i++) {
            if (types[i].equalsIgnoreCase(searchType)) {
                System.out.println("\nApplicant #" + (i + 1));
                System.out.println("Name   : " + names[i]);
                System.out.println("NIM    : " + NIMs[i]);
                System.out.println("GPA    : " + GPAs[i]);
                System.out.println("Income : " + incomes[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No applicants found for type: " + searchType);
        }
    }

    // ===== FUNGSI 4 =====
    // TO CALCULATE AVARAGE GPA
 public static void calcAverageGPA() {

        String[] scholarshipTypes = {"Regular", "Outstanding", "Research"};

        for (String type : scholarshipTypes) {
            double sum = 0;
            int count = 0;

            for (int i = 0; i < total; i++) {
                if (types[i].equalsIgnoreCase(type)) {
                    sum += GPAs[i];
                    count++;
                }
            }

            if (count > 0) {
                double avg = sum / count;
                System.out.println(type + " : Average GPA = " + avg);
            } else {
                System.out.println(type + " : no applicants.");
            }
        }
    }
}
