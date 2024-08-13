import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Prime Finder...");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Loading the results....\n");

        boolean prime = isPrime(num);
        if (prime){
            System.out.println("The given number is a Prime number...");
        } else {
            System.out.println("The given number is not a Prime number...");
        }
    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
