package kgcoding.exceptionChallenge;

import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Division Finder....\n");
        divisonCalculator();
    }

    public static void divisonCalculator(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc. nextInt();

        try{
            int result = num1 / num2;
            System.out.printf("Your result for the division is : %d", result);
        } catch (ArithmeticException e){
            if (e.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero exception occurred...");
            } else {
                throw e;
            }
        }
    }
}
