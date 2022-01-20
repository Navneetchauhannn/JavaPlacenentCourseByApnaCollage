public class recursion5 {
    public static void MoveChar(String str, int index, int count, String newString) {
        if(index == str.length()) {
            while(count != 0) {
                newString += 'x';
                count--;
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(index) == 'x') {
            count++;
            MoveChar(str, index+1, count, newString);
        }
        else{
           newString += str.charAt(index);
           MoveChar(str, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str ="axbxxcxxd";
        MoveChar(str, 0, 0, "");
    }
}
