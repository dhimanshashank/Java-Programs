public class MaximumAndMinimum {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum and Minimum Calculator...\n");

        // Importing from ArrayUtility class
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.outputArray(arr);

        System.out.println("Maximum number of the given array is: " + maximum(arr));
        System.out.println("Minimum number of the given array is: " + minimum(arr));
    }

    /**
     *
     * @param arr Input array from which maximum value is to be calculated
     * @return The maximum number present in an array
     */
    public static int maximum(int[] arr){
        if (arr.length == 0)    return Integer.MIN_VALUE;
        int max = arr[0];
        for(int i: arr){
            if (max < i)    max = i;
        }
        return max;
    }

    /**
     *
     * @param arr Input array from which minimum value is to calculated
     * @return The minimum number present in an array
     */
    public static int minimum(int[] arr){
        if (arr.length == 0)    return Integer.MAX_VALUE;
        int min = arr[0];
        for(int i: arr){
            if (min > i)    min = i;
        }
        return min;
    }
}
