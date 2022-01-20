// very very important for placement

public class recursion7 {
    public static void SubSequences(String str, int index, String newString) {
        if(index == str.length()) {
            System.out.println(newString);
            return;
        }
        char CurrentChar = str.charAt(index);
        
        //to be added current charecter
        SubSequences(str, index+1, newString+CurrentChar);

        //not to be added current charecter
        SubSequences(str, index+1, newString);

    }
    public static void main(String[] args) {
        String str = "abc";
        SubSequences(str, 0, "");
    }
}
