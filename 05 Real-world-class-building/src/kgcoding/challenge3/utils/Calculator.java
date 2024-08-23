package in.kgcoding.challenge3.geometry.utils;

import in.kgcoding.challenge3.geometry.Circle;
import in.kgcoding.challenge3.geometry.CircleCalculator;
import in.kgcoding.challenge3.geometry.Rectangle;
import in.kgcoding.challenge3.geometry.RectangleCalculator;

import java.util.Scanner;

public class Calculator {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Calculator of Rectangle and Circle....\n");

        System.out.print("Please enter the type of calculator (Rectangle / Circle): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("rectangle")){
            rectangleCalculator();
        } else if (choice.equalsIgnoreCase("circle")) {
            circleCalculator();
        } else {
            System.out.println("Please enter a valid entry...");
        }
    }

    private static void rectangleCalculator(){
        try{
            System.out.print("Enter the length of rectangle: ");
            int length = sc.nextInt();
            System.out.print("Enter the breadth of rectangle: ");
            int breadth = sc.nextInt();

            Rectangle rectangle = new Rectangle(length, breadth);
            RectangleCalculator rectangleCalculator = new RectangleCalculator();

            System.out.printf("The perimeter of your circle is: %f\n", rectangleCalculator.calculatePerimeter(rectangle));
            System.out.printf("The area of your circle is: %f\n", rectangleCalculator.calculateArea(rectangle));
        } catch (Exception e){
            System.out.println("Invalid Input. Please enter a positive numeric value.");
        }
    }

    private static void circleCalculator(){
        try{
            System.out.print("Enter the Radius of circle: ");
            double radius = sc.nextDouble();

            Circle circle = new Circle(radius);
            CircleCalculator circleCalculator = new CircleCalculator();

            System.out.printf("The perimeter of your circle is: %f\n", circleCalculator.calculatePerimeter(circle));
            System.out.printf("The area of your circle is: %f\n", circleCalculator.calculateArea(circle));
        } catch (Exception e){
            System.out.println("Invalid input. Please enter a positive numeric value.");
        }

    }
}
