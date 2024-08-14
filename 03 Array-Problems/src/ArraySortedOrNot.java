public class ArraySortedOrNot {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorted or not check point...\n");

        // Including the array utility classes for input
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.outputArray(arr);

        boolean isIncr = isIncreasing(arr);
        boolean isDecr = isDecreasing(arr);

        if(isIncr || isDecr){
            System.out.println("\nThe given array is SORTED!");
        } else {
            System.out.println("\nThe given array is NOT SORTED!");
        }
    }

    /**
     *
     * @param arr Input array for checking increasing order
     * @return Boolean value after checking the increasing order sequence of the array
     */
    public static boolean isIncreasing(int[] arr){
        int i = 1;
        while (i < arr.length){
            if (arr[i] < arr[i-1])  return false;
            i++;
        }
        return true;
    }

    /**
     *
     * @param arr Input array for checking decreasing order
     * @return Boolean value after checking the decreasing order sequence of the array
     */
    public static boolean isDecreasing(int[] arr){
        int i = 1;
        while (i < arr.length){
            if (arr[i] > arr[i-1])  return false;
            i++;
        }
        return true;
    }
}
