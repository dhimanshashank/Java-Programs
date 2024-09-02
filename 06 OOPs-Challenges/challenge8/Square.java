package kgcoding.challenge8;

public class Square extends Shape{
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }

}
