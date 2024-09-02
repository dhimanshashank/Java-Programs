import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        System.out.printf("Output for one argument: %s\n", concatenate("Shashank"));
        System.out.printf("Output for two arguments: %s\n", concatenate("Shashank", "Dhiman"));
        System.out.printf("Output for multiple arguments: %s\n", concatenate("Shashank", "Dhiman", "is", "an", "Engineer."));
    }

    public static String concatenate(String... a){
        StringBuilder ans = new StringBuilder();
        for (String s : a) {
            ans.append(s).append(" ");
        }
        return ans.toString();
    }
}
