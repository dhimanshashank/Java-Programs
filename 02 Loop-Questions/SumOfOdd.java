import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to OddSum Calculator...\n");
        System.out.print("Please enter the number up to which you need to find sum : ");
        int num = sc.nextInt();

        int sum = OddSum(num);
        System.out.println("The OddSum up to " + num + " is : " + sum);
    }

    public static int OddSum (int num){
        int sum = 0, i = 1;
        System.out.println("Loading the results....\n");
        while (i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
