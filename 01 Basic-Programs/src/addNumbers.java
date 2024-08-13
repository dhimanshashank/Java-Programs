import java.util.Scanner;

public class addNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.println("Enter second number : ");
        int num2 = input.nextInt();

        System.out.println("The sum of " + num1 + "+" + num2 + " is : " + (num1+num2));
    }
}
