package jobsheet9;

public class linearSearch {
    public static void main(String[] args) {
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int resutl = 0;

        for (int i =0; i< arrayInt.length; i++){
            if (arrayInt[i] == key ){
            resutl = i;
            break;
            }
        }
        System.out.println("The key in the array is located at index posision " + resutl);
    }
}
