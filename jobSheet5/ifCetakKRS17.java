package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS17 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);

        System.out.println("\n\n===PRITN KRS SIAKAT===");
        System.out.print("Have the tuition fees been paid in full ? (true/false) : ");
        boolean uktpaid = cs.nextBoolean();
        
        //tray to use ternary operator
        String result = uktpaid ?
        "UKT payment has been verified\nKRS now can be printed and you can ask the academic advi sor to sign it ." : 
        "Registration rejected. please pay UKT first.";
        
        System.out.println(result);
        cs.close();
    }
}
