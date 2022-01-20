public class recursion6 {
    public static boolean[] map = new boolean[26];
    public static void RemoveDuplicate(String str, int indx, String newString) {
        if(indx == str.length()) {
            System.out.println(newString);
            return;
        }

        if(map[str.charAt(indx)-'a'] == true) {
            RemoveDuplicate(str, indx+1, newString);
        } else {
            newString += str.charAt(indx);
            map[str.charAt(indx)-'a'] = true;
            RemoveDuplicate(str, indx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        RemoveDuplicate(str, 0, "");
    }
}
