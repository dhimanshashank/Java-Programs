public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Merge Two Sorted Array...");

        System.out.println("Enter the first array data below (sorted form): ");
        int[] arr1 = ArrayUtility.inputArray();
        System.out.println("Enter the second array data below (sorted form): ");
        int[] arr2 = ArrayUtility.inputArray();

        int[] mergedArr = mergeTwoSortedArray(arr1, arr2);
        System.out.print("Your merged array is: ");
        ArrayUtility.outputArray(mergedArr);
    }

    /**
     *
     * @param arr1 First sorted array
     * @param arr2 Second sorted array
     * @return The merged array from given two sorted arrays
     */
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] mergedArr = new int[newSize];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length || j < arr2.length){
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        return mergedArr;
    }
}
