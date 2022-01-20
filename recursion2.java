//reverse a string using recursion

public class recursion2 {

    public static void ReverseString(String str, int index) {
        if(index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index)); 
        ReverseString(str, index-1);
       
    }

    public static void main(String[] args) {
        String str = "abcd";
        ReverseString(str, str.length()-1);
    }
}
