import java.util.Scanner;

public class SumOfPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum of Positive Numbers...");
        int[] nums = ArrayUtility.inputArray();

        int sum = 0;
        for (int num : nums){
            if (num < 0)    continue;
            sum += num;
        }

        System.out.println("The sum of positive numbers is: " + sum);
    }
}
