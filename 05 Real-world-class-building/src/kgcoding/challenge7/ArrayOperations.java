package kgcoding.challenge7;

public class ArrayOperations {
    private final int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum/numbers.length;
        }
    }
}
