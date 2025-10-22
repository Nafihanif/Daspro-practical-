package dasproweek6;
import java.util.Scanner;
public class enterLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Library Entry Permit Checking System---");

        System.out.println("Do Students Bring ID ? (yes/no) : ");
        String id = input.nextLine().toLowerCase();
        System.out.println("Did Student do online registration ? (yes/no) : ");
        String reg = input.nextLine().toLowerCase();
        
        if (id.equals("yes")|| reg.equals("yes")){
            System.out.println("\nResult : There are allowed to enter. ");
        }else {
            System.out.println("\nResult : There are denied entery. ");
        }
        input.close();
    }  
}
