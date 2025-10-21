package UTSEXAM;
import java.util.Scanner;
public class coffeeShoop {
    public static void main (String []args){
        Scanner coc = new Scanner (System.in);
        //input data cofe
        System.out.print("Enter Time (Morning/Afternoon/Evenig) : ");
        String time = coc.nextLine(); 
        System.out.print("Enter Dring temperature (Hot/Cold) : ");
        String DT = coc.nextLine();

        //the real price 
        double basePrice = 0;
        double discount = 0;

        if (time.equals("Morning") && DT.equals("Hot")){
           basePrice = 15000;
           discount = 0.10;
        }else if (time.equals("Morning") && DT.equals("Cold")){
            basePrice = 18000;
        }else if (time.equals("Afternoon") && DT.equals("Hot")){
            basePrice = 20000;
             discount = 0.05;
        }else if (time.equals("Afterrnoon") && DT.equals("Cold")){
           basePrice = 22000;
            discount = 0.05;
        }else if (time.equals("Evening") && DT.equals("Hot")){
            basePrice = 17000;
        }else if (time.equals("Evening") && DT.equals("Hot")){
            basePrice = 19000;
            discount = 0.15;
        }else{
            System.out.println("Input tidak valid!");
            coc.close();
            return;
        }

        //calculate
        double Tpay;
        Tpay = basePrice * discount;
        //out put 
        System.out.println("Base price     : " + basePrice);
        System.out.println("Discount price : " + discount);
        System.out.println("Tolal payment  : " + Tpay);
        coc.close();
    }
    
}
