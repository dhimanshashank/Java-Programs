import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and average...\n");

        // Using the utility class in this method -> inputArray
        int[] nums = ArrayUtility.inputArray();
        // Using utility class in this to call -> outputArray
        ArrayUtility.outputArray(nums);

        // Calling the sumOfArray function
        long sum = sumOfArray(nums);
        double average = averageOfArray(nums);
        System.out.println("\nThe sum of elements of array is: " + sum);
        System.out.println("\nThe average of elements of array is: " + average);
    }

    /**
     * Returns the sum of elements of array
     * @param nums : Array for which sum is to calculated
     * @return sum : Returns sum of all elements in array
     * */
    public static long sumOfArray(int[] nums){
        long sum = 0;
        // Loop for finding the sum of elements
        for (int num: nums){
            sum += num;
        }
        return sum;
    }

    /**
     *
     * @param nums Input array from which average is to be calculated
     * @return Average value of the given array
     */
    public static double averageOfArray(int[] nums){
        double sum = sumOfArray(nums);
        return sum / nums.length;
    }
}