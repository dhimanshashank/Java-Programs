package kgcoding.challenge7;

public class TestClass {
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(new int[] {1,3,5,6,9});
        ArrayOperations.Statistics statistics= arr.new Statistics();
        System.out.println(statistics.mean());
    }
}
