import java.util.Scanner;

public class NumberOfOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number of occurances of number in Array...\n");

        // Including ArrayUtility class -> input and output function
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.outputArray(arr);

        System.out.print("Enter the number to find the occurances in your array: ");
        int n = sc.nextInt();
        int occurances = occurances(arr, n);
        System.out.println("\nYour element was found " + occurances + " times in the array.");
    }

    /**
     *
     * @param arr Input array in which we want to check the occurance
     * @param n Value for which we want to check for occurances
     * @return Total number of occurances
     */
    public static int occurances(int[] arr, int n){
        int result = 0;
        for (int i: arr){
            if(i == n){
                result++;
            }
        }
        return result;
    }
}
