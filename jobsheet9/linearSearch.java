package jobsheet9;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        //int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key;
        int indx = 0;

        System.out.print("Enter the number of array elements : " );
        int c = cs.nextInt();

        int[] arrayInt = new int[c];
        for (int i =0; i< arrayInt.length; i++){
            System.out.print("Enter the element " + i + " :");
            arrayInt [i] = cs.nextInt();
        }

        System.out.print("Enter the key you want to search for :");
        key = cs.nextInt();

        boolean result;
        for (int i =0; i < arrayInt.length; i++){
            if (arrayInt[i] == key ){
            indx = i;
            result = true;
            } else {
                result = false;
            }
        }
        if (result= true){
         System.out.println("The key in the array is located at index posision " + indx);
        }else{
            System.out.println("The key is not found ");
        }
        cs.close();
    }
}
