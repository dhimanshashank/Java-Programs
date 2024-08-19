import java.util.Scanner;


// Do-while loop practice
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to Password checker....\n");
        String password;
        do{
            System.out.print("Please enter your password: ");
            password = sc.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for entering a valid password...");
    }

    public static boolean isValidPassword(String password){
        return password.length() > 6;
        // Basic password check
    }
}
