public class recursion4 {
    public static boolean IsArrSortedIncreasing(int array[], int index) {
        if(index == array.length-1) {
            return true;
        }
        if(array[index] >= array[index+1]) {
            return false;
        } 
        else return IsArrSortedIncreasing(array, index+1);

    }
    public static void main(String[] args) {
        int array[] = {1,3,5};
        System.out.println(IsArrSortedIncreasing(array, 0));
    }
}
