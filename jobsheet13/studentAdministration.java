package jobsheet13;
import java.util.Scanner;
public class studentAdministration {
    // data structure 
    // === GLOBAL VARIABLE ===
    static final int MAX = 100; 
    // capcity maximum, and final to ensure the MAX value doesn't change
    static String[] names = new String[MAX]; // name of student 
    static String[] NIMs = new String[MAX];  // ID student 
    static double[] GPAs = new double[MAX];  // GPA student 
    static String[] types = new String[MAX]; // type of Scholarship  
    static int[] incomes = new int[MAX];     // parent income 
    static int total = 0; //sum of data have save 
    // use static to acses variable in each function use static 
    // can use 2 dimentional function but prone to error and just use one type of data 

    // ===== MAIN FUNGSI =====
    public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    while(true) {
        System.out.println("=========================================");
        System.out.println("     SHCOLARSHIP REGISTRATION SYSTEM     ");
        System.out.println("=========================================");
        System.out.println("1. Add Shcolarship Applicant Data");
        System.out.println("2. Display All Applicants");
        System.out.println("3. Search Applicants by Scholarship Type");
        System.out.println("4. Calculate Avarage GPA by Shcolarship Type ");
        System.out.println("5. Exit ");
        System.out.print("Choose menu (1-5) : ");
        int choice = Integer.parseInt(input.nextLine()); 
        // atau bisa langsung menggunakan input.nextInt(); tapi harus di cleanup dengan input.close();
        System.out.println();

        switch (choice) {
        case 1: addApplicant(input); break;
        case 2: displayApplicants(); break;
        case 3: searchByType(input); break;
        case 4: calcAverageGPA(); break;
        case 5: System.out.println("Goodbye!"); 
                input.close(); // fungsi dari input.close(); adalah untuk menutup Scanner 
                return; // adalah mengeluarkan dari main dan menghentikan program 

        default: System.out.println("Invalid choice.");
          }
        System.out.println();
       }
    } 

    // ===== FUNGSI 1 =====
    // TO ADD SHOLARSHIP APPLICANT DATA
    // access modifier : public 
    // static          : yes (because it is called from main static)
    // return-type     : void (does not return a value)   
    // parameter       : Scanner input to input data 
    public static void addApplicant(Scanner input) { // use void because no need return value 
        if(total >= MAX) {System.out.println("strorage full. " );return;}

        System.out.print("Student Name : ");
        String name = input.nextLine();

        System.out.print("NIM : ");
        String NIM = input.nextLine();

        System.out.print("Latest GPA : ");
        double GPA = Double.parseDouble(input.nextLine());

        System.out.print("Scholarship Type (Regular/ Outstanding/ Reshearch) : ");
        String type = input.nextLine();
        
        //validasi type of shcolarship 
        if(!type.equalsIgnoreCase("Regular") &&
           !type.equalsIgnoreCase("Outstanding") &&
           !type.equalsIgnoreCase("Reshearch")){
            System.out.println("Invalid Shcolarship type !");
            return; // maksud dari return adalah mengembalikan ke kondisi awal karena data yang dimasukkan tidak valid / mengeluarkan dari main tersebut.
           }

        // Enter the parent's income, and maximum income is 2.000.000   
        System.out.print("parent's income (maximum 2000000) : "); 
        int income = Integer.parseInt(input.nextLine());
        // Validasi income  
        if (income > 2000000){
            System.out.println("Application rejected because parent's income exceeds the maximum limit.");
            return; // karena data yang dimasukkan tidak valid maka kembali ke keluar dari main tersebut 
        }
        //save data 
        names[total] = name;
        NIMs [total] = NIM;
        GPAs [total] = GPA;
        types[total] = type;
        incomes [total] = income;
        total++; // plus the total 
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
    public static void searchByType(Scanner input) {
        System.out.print("Enter scholarship type: ");
        String searchType = input.nextLine();

        boolean found = false; // untuk mengecek apakah sudah ditemukan 

        for (int i = 0; i < total; i++) {
            if (types[i].equalsIgnoreCase(searchType)) {
                System.out.println("\nApplicant #" + (i + 1));
                System.out.println("Name   : " + names[i]);
                System.out.println("NIM    : " + NIMs[i]);
                System.out.println("GPA    : " + GPAs[i]);
                System.out.println("Income : " + incomes[i]);
                found = true; // if the applicant have found than result of found change to true 
            }
        }

        if (!found) { // if the applicant is not found tahn the program print this sentence 
            System.out.println("No applicants found for type: " + searchType);
        }
    }

    // ===== FUNGSI 4 =====
    // TO CALCULATE AVARAGE GPA
    public static void calcAverageGPA() {
        String[] scholarshipTypes = {"Regular", "Outstanding", "Research"};
        // loop to calculate the avarage of each type Scholarship 
        for (String type : scholarshipTypes) { // to each scholarship
            double sum = 0; // total avarage GPA 
            int count = 0;  // sum applicants 

            for (int i = 0; i < total; i++) {  // check all data and classification to each type one by one started by Regular 
                if (types[i].equalsIgnoreCase(type)) {  // there is 3 type of scholarship
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
// nb: The public in this code does not have much influence because it is still in one main function
// you can change also from the pulic to private 