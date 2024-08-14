import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM calculator...");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Loading the results....\n");
        System.out.println("The GCD for the numbers is : " + gcd(num1, num2));
    }

    /**
     *
     * @param num1 Provided first input by the user
     * @param num2 Provided second number by the user
     * @return Greatest Common Divisor (GCD) of the two numbers
     */
    public static int gcd(int num1, int num2){
        int result = 1, i = 2;
        int least = smallerNumber(num1, num2);

        while (i <= least){
            if ((num1 % i == 0) && (num2 % i == 0)){
                result = i;
            }
            i++;
        }
        return result;
    }

    /**
     *
     * @param num1 First input by the user
     * @param num2 Second input by the user
     * @return Smallest number among the two inputs
     */
    public static int smallerNumber(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        return num2;
    }
}
