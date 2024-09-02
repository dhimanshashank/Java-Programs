import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list){
        // We can use the default method from Collections class i.e.
        // Collections.reverse();

        // Calling ListSwapping class from other class to just swap the two numbers.
        for (int i = 0; i < list.size() / 2; i++) {
            ListSwapping.swap(list, i, list.size() - 1 - i);
        }
    }
}
