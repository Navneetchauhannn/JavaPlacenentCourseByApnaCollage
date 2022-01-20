import java.util.*;
public class Array {
    public static void main(String[] args) {
        int[] Array = new int[10];
        // Array[0] = 1;
        // Array[1] = 2;
        // System.out.println(Array[0] + " " +Array[1]);
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<4; i++) {
            Array[i] = in.nextInt();
        }
        for(int i=0; i<4 ; i++) {
            System.out.println(Array[i]);
        }
        in.close();
    }    
}
