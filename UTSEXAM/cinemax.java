package UTSEXAM;
import java.util.Scanner;
public class cinemax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variable 
        String day;
        int age;
        double basePrice = 0;
        double discount = 0;
        double surcharge = 0;
        double finalPrice = 0;
        
        System.out.print("Entet day type (weekday/weekend): ");
        day = input.nextLine();
        System.out.print("Enter audience age: ");
        age = input.nextInt();
        
        //validation 
        if (age <= 0) {
            System.out.println("age is invalid!");
            input.close();
            return;
        }
        if (day.equals("weekday")){
            basePrice = 40000;

            if (age <= 12){
                discount = 0.50;
            } else if  (age >= 60){
                discount = 0.30;
            }

        }else if (day.equals("weekend")){
            basePrice = 50000;

            if (age <= 12){
                discount = 0.30;
            } else if (age >= 60){
                discount = 0.10;
            }
            if (age >= 18 && age <= 25){
                surcharge = 0.05;
            }

        }else {
            System.out.println("input is invalid! ");
            input.close();
        }

        //calculate total price
        finalPrice = basePrice - (basePrice*discount) + (basePrice*surcharge);
        //output
        System.out.println("The Base Price: Rp" + basePrice);
        System.out.println("Discount: " + discount);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("The Final Tiket Price: Rp" + finalPrice);
    }
    
}
