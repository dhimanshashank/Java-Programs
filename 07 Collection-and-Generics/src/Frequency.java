import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3,4,1,5,2,1);
        frequency(list);
    }

    private static void frequency(List<Integer> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find: ");
        Integer num = sc.nextInt();
        System.out.printf("The frequency of the given number is: %d", Collections.frequency(list, num));
    }
}
