import java.util.ArrayList;
import java.util.Collections; // java.util.*

public class ArrayList
{
	public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // add at last position of list -> list.add(element)
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);
        
        // ger element which is at i Index -> list.get(Index)
        int ele = list.get(1);
        System.out.println(ele);
        
        // add element in berween -> list.add(Index, element)
        list.add(2,2);
        list.add(4,5);
        System.out.println(list);
        
        // set element -> list.set(Index, element)
        list.set(0,4);
        System.out.println(list);
        
        // delete element -> list.remove(Index)
        list.remove(3);
        System.out.println(list);
        
        // size of list
        int size = list.size();
        System.out.println(size);
        
        // traverse in ArrayList
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        System.out.println();
        // sorting
        Collections.sort(list);
        System.out.println(list);
	}
}

