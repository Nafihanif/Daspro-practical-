package jobsheet10;

import java.util.Arrays;
public class numbers17 {
    public static void main(String[] args) {
        int [][] myNumbers = new int [3][];
        myNumbers [0] = new int[5];
        myNumbers [1] = new int[3];
        myNumbers [2] = new int[1];
        
        for(int i =0; i<myNumbers.length; i++){
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for(int i = 0; i<myNumbers.length;i++){
            for(int j = 0; j<myNumbers[i].length; j++){
            System.out.print(myNumbers[i][j]);
        }
            System.out.println();
        }
        for(int i = 0; i < myNumbers.length; i++){
            System.out.println("leght of row " + (i+1)+":"+myNumbers[i].length);
        }
    }
}
