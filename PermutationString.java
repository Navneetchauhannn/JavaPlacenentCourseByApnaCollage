public class PermutationString {
    public static void PrintPermutations(String str, String permutation) {

        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++) {        // explanied in java notes
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            PrintPermutations(newString, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        PrintPermutations(str, "");
    }
}
