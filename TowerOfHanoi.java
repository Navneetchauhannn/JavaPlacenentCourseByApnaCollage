import java.util.logging.Handler;

public class TowerOfHanoi {

    public static void TowerOHanoi(int n, char source, char helper, char dest) {

        if(n == 1) {
            System.out.println("move disk " + n + " from "  + source + " to " + dest);
        }else {
        TowerOHanoi(n-1,source,dest,helper);
        System.out.println("move disk " + n + " from "  + source + " to " + dest);
        TowerOHanoi(n-1, helper, source, dest);
        }
    }
    public static void main(String[] args) {
        TowerOHanoi(2, 's', 'h', 'd');
    }
}
