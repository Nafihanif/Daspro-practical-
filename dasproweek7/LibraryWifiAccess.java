package dasproweek7;
import java.util.Scanner;
public class LibraryWifiAccess {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Are you an active student? (yes/no) : ");
        String status = input.nextLine();
        
        if (status.equalsIgnoreCase("yes")){
            System.out.print("Are you registered at the library? (yes/no): ");
            String list = input.nextLine();

            if (list.equalsIgnoreCase("yes")){
                System.out.println("You can borrow books and access campus WiFi");

                } else {
                    System.out.println("Please register at the library first");               
            } 
        } else {
            System.out.println("Access denied. Active students only");
        }
        input.close();
    }
}
