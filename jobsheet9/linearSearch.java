package jobsheet9;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        //int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key;
        int resutl = 0;

        System.out.print("Enter the number of array elements : " );
        int c = cs.nextInt();

        int[] arrayInt = new int[c];
        for (int i =0; i< arrayInt.length; i++){
            System.out.print("Enter the element " + i + " :");
            arrayInt [i] = cs.nextInt();
        }

        System.out.print("Enter the key you want to search for :");
        key = cs.nextInt();

        for (int i =0; i< arrayInt.length; i++){
            if (arrayInt[i] == key ){
            resutl = i;
            System.out.println("The key in the array is located at index posision " + resutl);
            break;
            } else {
                System.out.println("The key is not found ");
                break;
            }
        }
        cs.close();
    }
}
