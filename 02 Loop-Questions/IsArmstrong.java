import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Armstrong checker...\n");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Loading the results....\n");

        boolean armstrong = isArmstrong(num);
        if (armstrong){
            System.out.println("The given number is an armstrong number...");
        } else {
            System.out.println("The given number is not an armstrong number...");
        }
    }

    /**
     * Returns a Boolean value if the given number is an Armstrong or not.
     *
     * @param num The number entered by the user
     * @return Boolean value at the end.
     *             */
    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num), finalNumber = 0;
        int numCopy = num;
        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == numCopy;
    }

    /**
     * Returns a number as the num1 to the power num2
     *
     * @param num1 The number or base for the calculation
     * @param num2 The number to which we want to multiply
     * @return num1 to the power num2.
     */
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while (num2 > i){
            result *= num1;
            i++;
        }
        return result;
    }

    /**
     * Provides the Length of digits
     *
     * @param num The number given to find the number of digits
     * @return Integer value about the number of digits
     */
    public static int noOfDigits(int num){
        int digit = 0;
        while (num > 0){
            digit++;
            num /= 10;
        }
        return digit;
    }
}