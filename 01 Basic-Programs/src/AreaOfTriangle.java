import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome to Area of Triangle calculator");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter breath of the triangle : ");
        float b = sc.nextFloat();

        System.out.print("Enter height of the triangle : ");
        float h = sc.nextFloat();

        System.out.println("\n Loading the results....");
        double area = b*h*(0.5);
        System.out.println("The area of the given triangle is : " + area);
    }
}
