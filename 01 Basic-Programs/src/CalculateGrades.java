import java.util.Scanner;

public class CalculateGrades {
    public static void main(String[] args) {
        System.out.println("Welcome to Grades calculator\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Marks : ");
        float marks = sc.nextFloat();

        if (marks >= 90){
            System.out.println("Hurray! You have A grade!");
        } else if (marks < 90 && marks >= 75) {
            System.out.println("Hurray! You have B grade!");
        } else if (marks < 75 && marks >= 60) {
            System.out.println("Great! You have C grade!");
        } else if (marks < 60 && marks >= 30) {
            System.out.println("You have D grade!");
        }else {
            System.out.println("You have to work hard! You have F grade!");
        }
    }
}
