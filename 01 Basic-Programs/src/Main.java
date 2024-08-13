import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter your name : ");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.println("Good Morning " + userName);
        System.out.println(userName + ", Please enter your age : ");
        int age = input.nextInt();
        System.out.println("Hello " + userName + ", your age is : " + age);
    }
}