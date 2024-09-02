package kgcoding.challenge10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        System.out.println("\n\tWelcome to the Robust File Reader....\n");
        robustReader();
    }

    private static void robustReader(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the file name you want to read: ");
        String fileName =  sc.next();

        try (FileReader fileReader = new FileReader(fileName)){
            int read;
            while ((read = fileReader.read()) != -1){
                System.out.print((char) read);
            }
        } catch (FileNotFoundException exception){
            System.out.printf("Exception occurred: %s", exception.getMessage());
        } catch (IOException e){
            System.out.printf("An error occurred: %s", e.getMessage());
        }
    }
}
