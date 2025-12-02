package jobsheet10;
import java.util.Scanner;
public class cinemaWhithScanner17 {
    public static void main(String[] args) {
        Scanner coc = new Scanner(System.in);
        int row, column;
        String name, next;
        
        String [][] audience = new String [4][2];

        while (true){
            System.out.print("Enter a name     : ");
            name =coc.nextLine();
            System.out.print("Enter row number : ");
            row = coc.nextInt();
            System.out.print("Enter column     : ");
            column = coc.nextInt();
            coc.nextLine();

            audience[row -1 ][column -1 ] = name ;
            System.out.print("Are there any other audiences to be added ? (y/n): ");
            next = coc.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
        coc.close();
    }
}
