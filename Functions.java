import java.util.*;
public class Functions {
    public static int FindFactorial(int n) {
        if(n == 1){
            return 1;
        }
        else return n*FindFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int factorial;
        factorial = FindFactorial(num);
        System.out.println(factorial);
        in.close();
    }
}
