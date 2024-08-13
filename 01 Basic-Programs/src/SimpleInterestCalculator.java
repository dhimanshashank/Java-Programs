import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Interest calculator");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter Principle amount ₹: ");
        float p = sc.nextFloat();

        System.out.print("Now, please enter the Time duration (years) you want to borrow : ");
        float t = sc.nextFloat();

        System.out.print("Now, please enter the Rate of Interest (%): ");
        float r = sc.nextFloat();

        System.out.println("Loading the Simple Interest...");
        double simpleInterest = (p*t*r)/100;
        System.out.println("The Simple Interest for the given data is : " + simpleInterest);
    }
}
