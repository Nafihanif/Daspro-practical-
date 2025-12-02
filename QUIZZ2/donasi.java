package QUIZZ2;
import java.util.Scanner;
public class donasi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //opening
        System.out.println("\n=== DONATION FOR SUMATRA === ");
        System.out.println("forms of donation: food, clothing, medicine");

        //input 
        System.out.print("Enter the number of regions : ");
        int wilayah = input.nextInt();
        
        //declaration array
        String wil [] = new String[wilayah];
        int donat [][] = new int[wilayah][3];

        //input wilayah and donat
        for ( int i =  0 ; i < wil.length; i++){
            System.out.print("\nEnter the name of " + (i+1)+ " region :");
            wil [i] = input.next();
            input.nextLine();

            System.out.println("Enter the donation according the type !!");
                System.out.print("Food       :");
                donat[i][0] = input.nextInt(); 
                System.out.print("Clothing   :");
                donat[i][1] = input.nextInt();
                System.out.print("Medicine   :");
                donat[i][2] = input.nextInt();
            }

        //total calcution every region 
        int total [] = new int[wilayah];  
        for( int j = 0; j <wilayah ; j++){
            for (int k = 0; k <3; k++){
                total[j] += donat[j][k];
            }
        }

        //find the higher donation
        int hight = total[0];
        int reg = 0;
        for (int a = 0; a <total.length; a++){
            if (total[a] > hight){
                hight = total[a];
                reg = a;
            }
        }
        System.out.println("\n=== TRANSPARENCY OF COLLECTED DONATIONS ===");
        
        //print the all result 
        for (int w = 0; w < wil.length; w++){
            System.out.println("\nREGION     : " + wil [w]);
            System.out.println("donation   : Food, Clothing, Medicine,");
            System.out.print("Sum of donation :");
            for(int v = 0; v < 3; v++){
                System.out.print(donat[w][v]+ ", ");
            }
            System.out.println();
            System.out.println("Total donation  : " + total[w]);
        }
        System.out.println("\nThe highest total donation is : " + hight);
        System.out.println("From region                   : " +  wil[reg]);
        input.close();
    } 
}
