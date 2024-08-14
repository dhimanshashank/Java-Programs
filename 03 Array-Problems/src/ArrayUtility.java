import java.util.Scanner;

public class ArrayUtility {

    /**
     * Input the array of the desired length
     * @return nums : Array entered by the user
     */
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please the number of elements: ");
        int size = sc.nextInt();

        // User input of array elements
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter the element of array at " + i +": ");
            nums[i] = sc.nextInt();
        }

        return nums;
    }

    /**
     * Prints the given array
     * @param nums Input to be given by the user
     */
    public static void outputArray(int[] nums){
        Scanner sc = new Scanner(System.in);

        // printing the user input
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
