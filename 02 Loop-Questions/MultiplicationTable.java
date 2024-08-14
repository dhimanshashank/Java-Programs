import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Multiplication Table Generator!\n");
        System.out.print("Enter the Number to get the Multiplication table : ");
        int num = sc.nextInt();
        printMultiplication(num);
    }

    /**
     *
     * @param num Number for which multiplication table is to be generated
     */
    public static void printMultiplication(int num){
        System.out.println("\nLoading the table....");
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
