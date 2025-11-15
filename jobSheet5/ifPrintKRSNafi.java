package jobsheet5;
import java.util.Scanner;
public class ifPrintKRSNafi {
    public static void main(String[] args) {
        Scanner twk = new Scanner (System.in);

        System.out.println("\n---Print KRS SIAKAD---");
        System.out.print("Has the UKT been paid in full? (true/false)");
        boolean uktpaid = twk.nextBoolean();

        if (uktpaid){
            System.out.println("verified UKT payment");
            System.out.println("Please print the KRS and ask for the DPA's signature");
        }else {
             System.out.println("Registration rejected. Please pay UKT first");
        }
        twk.close();
    }
}
