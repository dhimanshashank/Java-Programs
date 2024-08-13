import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM calculator...");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Loading the results....\n");
        System.out.println("The LCM for " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }

    public static int lcm(int num1, int num2){
        int i = 1;
        while (true){
            int factor = num1 * i;
            if (factor % num2 == 0){
                return factor;
            }
            i++;
        }
    }
}
