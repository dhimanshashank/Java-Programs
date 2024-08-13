import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum Of Digits calculator...");
        System.out.print("Please enter the number : ");
        int num = sc.nextInt();

        System.out.println("The Sum of digits of " + num + " is: " + SumOfDigit(num));
    }

    public static int SumOfDigit(int num){
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}
