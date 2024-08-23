import java.util.Objects;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("\nWelcome to The Number Guessing Game...\n");
        guessNumber();
    }

    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        int num = (int) Math.ceil(Math.random() * 100);
        int guessedNo;
        String input;
        do {
            System.out.print("Please enter the guessed number (1-100): ");
            guessedNo = sc.nextDouble();
            if (num > guessedNo){
                System.out.println("Your guess is smaller! Think bigger...\n");
            } else {
                System.out.println("Your guess is greater! Think of a smaller one..");
            }

            System.out.print("Do you need answer (true OR false): ");
            input = sc.next();

            if (Objects.equals(input, "true") || Objects.equals(input, "True")){
                System.out.println("The correct answer is: " + num);
                break;
            } else {
                System.out.println("Hurray!!! You guessed it right... \nThe number is: " + num);
            }
        } while (num != guessedNo);
    }
}
