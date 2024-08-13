import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Reverse Digits...");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Loading the results....\n");

        System.out.println("The reverse of " + num + " is: " + reverse(num));
    }

    public static int reverse(int num){
        int result = 0;
        while (num != 0){
            int digit = num % 10;
            result = result * 10 + digit;
            num /= 10;
        }
        return result;
    }
}
