package jobsheet5;
import java.util.Scanner;
public class switchPrintKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PRINT KRS SIAKAD ===");
        System.out.print("Enter currnet semester : ");
        int semester = sc.nextInt();
        
        switch (semester) {
            case 1:
                System.out.println("KRS semester 1 is displayed");
                break;
            case 2:
                System.out.println("KRS semester 2 is displayed");
                break;
            case 3:
                System.out.println("KRS semester 3 is displayed");
                break;
            case 4:
                System.out.println("KRS semester 4 is displayed");
                break;
            case 5:
                System.out.println("KRS semester 5 is displayed");
                break;
            case 6:
                System.out.println("KRS semester 6 is displayed");
                break;
            case 7:
                System.out.println("KRS semester 7 is displayed");
                break;
            case 8:
                System.out.println("KRS semester 8 is displayed");
                break;
        
            default:
            System.out.println("Invalid semester");
                break;
        }
    }
    
}
