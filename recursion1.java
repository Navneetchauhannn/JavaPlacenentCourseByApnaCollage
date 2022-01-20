//febonaccie series
public class recursion1 {
//     public static void printb(int a, int b, int n) {
//         if(n == 2) {
//             System.out.print("sum = ");
//             System.out.println(a+b);
//             return;
//         }
//         else{
//         System.out.println(a+b);
//         printb(b, a+b, n-1);
//         }
//     }
//     public static void main(String[] args) {
//         int a = 1,b = 2,n = 5;
//         System.out.println(a);
//         System.out.println(b);
//         printb(a, b, n);

// }


//x^n stack height logn
public static int CalcPower(int x, int n) {
    if(x == 0) {
        return 0;
    }
    if(n == 0) {
        return 1;
    }

    //if n is even
    if(n%2 == 0) {
        return CalcPower(x, n/2) * CalcPower(x, n/2);
    }
    //n is odd
    else{
        return CalcPower(x, n/2) * CalcPower(x, n/2) * x;
    }
}
public static void main(String[] args) {
    int x = 2, n = 5, ans;
    ans = CalcPower(x, n);
    System.out.println(ans);
}
}
