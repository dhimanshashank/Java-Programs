import java.util.Scanner;

public class LeepYearCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Leap Year calculator\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("The given " + year + " is a leap year!");
        } else if (year % 100 == 0) {
            System.out.println("The given " + year + " is not a leap year!");
        } else if (year % 4 == 0) {
            System.out.println("The given " + year + " is a leap year!");
        }else {
            System.out.println("The given " + year + " is not a leap year!");
        }
    }
}
