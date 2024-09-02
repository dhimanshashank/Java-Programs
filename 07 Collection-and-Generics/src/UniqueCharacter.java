import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your string: ");
        String userString = sc.next();

        for (char c : userString.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("Your string has %d number of unique characters!\n", unique.size());
        System.out.print("Your characters in string is: [");
        for (Character c : unique) {
            System.out.print(c + ", ");
        }
        System.out.print("]");
    }
}
