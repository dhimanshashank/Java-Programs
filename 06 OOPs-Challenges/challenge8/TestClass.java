package kgcoding.challenge8;

import java.util.Scanner;

// Using Abstract classes for the first time as these classes cannot be instantiated further.
// Here Shape class is an abstract class which consist of abstract methods which must be defined in its child classes.
// We had build 2 methods named as calculateArea() and calculatePerimeter() in Shape class and each of the child class had implemented it on their own.

public class TestClass {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to the Abstracted Area calculator...\n");

        System.out.print("What do you want to calculate (Circle or Square): ");
        String input = sc.next();

        if (input.equalsIgnoreCase("circle")){
            circleCalculator();
        } else if (input.equalsIgnoreCase("square")){
            squareCalculator();
        } else {
            throw new IllegalArgumentException("Wrong input entered..");
        }
    }

    private static void circleCalculator(){
        System.out.println("\nWelcome to Circle Calculator...\n");

        System.out.print("Enter the radius in CMs: ");
        double radiusInCms = sc.nextDouble();
        Circle circle = new Circle(radiusInCms);

        System.out.printf("The area of your circle is: %f\n", circle.calculateArea());
        System.out.printf("The perimeter of your circle is: %f\n", circle.calculatePerimeter());
    }

    private static void squareCalculator(){
        System.out.println("\nWelcome to Square Calculator...\n");

        System.out.print("Enter the length in CMs: ");
        double length = sc.nextDouble();
        Square square = new Square(length);

        System.out.printf("The area of your circle is: %f\n", square.calculateArea());
        System.out.printf("The perimeter of your circle is: %f\n", square.calculatePerimeter());
    }
}
