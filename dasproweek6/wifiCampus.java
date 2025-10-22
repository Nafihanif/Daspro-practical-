package dasproweek6;
import java.util.Scanner;
public class wifiCampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===campus wifi checking system===");

        System.out.print("Type of user (lecturer/student/other) : ");
        String userType = input.nextLine().toLowerCase();

        if (userType.equals("lecturer")){
            System.out.println("\nResult : wifi access granted (lecturer).");
        } else if (userType.equals("student")){
            System.out.println("---Active Student check---");
            System.out.print("Enter the amount SKS taken :");
            int sks = input.nextInt();
            
            if (sks >= 12){
                System.out.println("\nResult : wifi access granted (student).");
            } else {
                System.out.println("\nResult : Access denied, SKS less than 12.");
            }

        }else {
            System.out.println("\nResult : Access danied ");
        }
        input.close();
    }
}
