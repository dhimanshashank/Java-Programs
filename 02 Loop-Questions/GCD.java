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

    public static int smallerNumber(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        return num2;
    }
}
