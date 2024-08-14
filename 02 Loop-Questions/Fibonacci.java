import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Fibonnaci series printer...");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Loading the results....\n");
        printFibonacci(num);
    }

    /**
     * Prints the Fibbonaaci series upto a given number
     * @param num Input number upto which Fibbonacci series is to be generated
     */
    public static void printFibonacci(int num){
        if (num < 0)    return;
        System.out.print("0 ");
        if (num == 0)   return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
