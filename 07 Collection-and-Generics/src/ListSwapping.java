import java.util.Arrays;
import java.util.List;

public class ListSwapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("Before swapping: " + list);
        swap(list, 1, 5);
        System.out.println("After swapping: " + list);
    }

    /**
     * Used to swap two numbers in a list using the provided index position
     *
     * @param list List of Integers
     * @param x Index of first element
     * @param y Index of second element
     */
    public static void swap(List<Integer> list, int x, int y){
        int swap = list.get(x);
        list.set(x,list.get(y));
        list.set(y, swap);
    }
}
