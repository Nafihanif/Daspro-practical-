package dasproweek7;
import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Input the number : ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        input.close();
    }

}