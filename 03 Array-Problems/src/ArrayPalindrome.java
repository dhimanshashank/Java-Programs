public class ArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker...");

        int[] arr = ArrayUtility.inputArray();
        boolean isPalim = isPalindrome(arr);
        if (isPalim){
            System.out.println("The given array is a PALINDROME..");
        } else {
            System.out.println("The given array is NOT A PALINDROME");
        }
    }

    /**
     *
     * @param arr : Given array to be checked
     * @return Boolean value for the palindrome condition for given array
     */
    public static boolean isPalindrome(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i < j){
            if (arr[i] != arr[j])   return false;
            i++;
            j--;
        }

        return true;
    }
}
