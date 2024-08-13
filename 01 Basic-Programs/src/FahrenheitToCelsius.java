import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Welcome to Fahrenheit to Celsius calculator");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit : ");
        float f = sc.nextFloat();

        System.out.println("Loading your Temperature....");
        float celsius = (f - 32) * 5/9;
        System.out.println("Your temperature(celsius) is : " + celsius);
    }
}
