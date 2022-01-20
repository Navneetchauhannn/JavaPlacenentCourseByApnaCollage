import java.util.*;
class FirstJavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Fullname = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(Fullname);
        System.out.println(age);
        sc.close();
    }
}