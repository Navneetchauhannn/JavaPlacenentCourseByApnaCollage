// import java.util.*;
public class JavaString {
    public static void main(String[] args) {
        //static decleration 
        //String name = "navneet";
        //get from users
        // Scanner in = new Scanner(System.in);
        // String Language = in.next();
        //System.out.println(name + " " +Language);
        // for(int i = 0;i<Language.length();i++) {
        //     System.out.print(Language.charAt(i));
        // }

        //substring
        // System.out.println(name.substring(0,3));

        //string to integer
        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number/2);

        //integer to string
        // int number = 123;
        // String str = Integer.toString(number);
        // System.out.println(str.charAt(0));




//         //string builder
//         StringBuilder sb = new StringBuilder("Nav");
//         System.out.println(sb);

//         //char at index 0
//         System.out.println(sb.charAt(0));

//         //ser char at index 0
//         sb.setCharAt(0, 'S');
//         System.out.println(sb);

//         //insert at index
//         sb.insert(3, "n");
//         System.out.println(sb);

//         //delete char 
//         sb.delete(0, 1);
//         System.out.println(sb);

//         //insert at end
//         sb.append('i'); //str = str + "i";
//         sb.append("t");
//         System.out.println(sb);



            //reverse a string 
            StringBuilder str = new StringBuilder("hell0");
            int front=0,end = str.length()-1;
            for(int i=0; i<str.length()/2; i++) {
                char frontChar = str.charAt(front);
                char backChar = str.charAt(end);
                str.setCharAt(front, backChar);
                str.setCharAt(end, frontChar);
                front++;
                end--;
            }
            System.out.println(str);
    }
}
//string are immutable
// string in java can't be modify once declered            to modify string we will use string builder