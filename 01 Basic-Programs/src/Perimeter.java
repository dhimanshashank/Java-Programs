import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rectangle perimeter calculator!");

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.print("Enter the third number : ");
        int c = sc.nextInt();

        System.out.print("Enter the fourth number : ");
        int d = sc.nextInt();

        System.out.println("\nLoading your result....");
        System.out.println("The perimeter of your rectangle is : " + (a+b+c+d));
    }
}
