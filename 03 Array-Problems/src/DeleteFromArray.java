import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Array Element Deletion");

        // Importing utility class for array input and output
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.outputArray(arr);

        System.out.print("Please enter the number to be deleted: ");
        int numToDelete = sc.nextInt();
        int[] newArr = deleteFromArray(arr, numToDelete);

        System.out.print("The new array after deletion is as follows : ");
        ArrayUtility.outputArray(newArr);
    }

    /**
     *
     * @param arr : The original array
     * @param numToDelete : The number to be deleted
     * @return new array with updated changes
     */
    public static int[] deleteFromArray(int[] arr, int numToDelete){
        int occ = NumberOfOccurances.occurances(arr, numToDelete);
        if(occ == 0)    return arr;

        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;

        while (i < arr.length){
            if (arr[i] != numToDelete){
                newArr[j] =  arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
