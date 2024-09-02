package kgcoding.challenge9;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Using interfaces for the first time...\n");

        // Flyable is an interface who's object cannot be created and Bird is an abstract class who's object cannot be created.
        // Hence we created Eagle object and called fly() method in interface...
        Eagle eagle = new Eagle();
        eagle.fly();
    }
}
