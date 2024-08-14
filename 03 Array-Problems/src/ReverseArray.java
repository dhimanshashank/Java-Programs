public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Reversing the array...");

        // Including the utility classes for input and printing the array
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.outputArray(arr);

        reverseArray(arr);
    }

    /**
     * Prints the reversed array
     * @param arr Input array to be reversed
     */
    public static void reverseArray(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[j - i];
            arr[j - i] = swap;
            i++;
        }

        System.out.print("\nThe reversed array is: ");
        ArrayUtility.outputArray(arr);
    }
}
