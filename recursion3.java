public class recursion3 {
    static int first = -1;
        static int last = -1;
    public static void FindOccurence(String str, int index, char c) {

        if(index == str.length()-1) {
            System.out.println(first + " " +last);
            return;
        }
        if(str.charAt(index) == c) {
            if(first == -1) {
                first = index;
                last = index;
            }
            else{
                last = index;
            }
        }
        FindOccurence(str, index+1, c);

    }
    public static void main(String[] args) {
        String str = "abcxnv";
        FindOccurence(str, 0, 'a');
    }
}
