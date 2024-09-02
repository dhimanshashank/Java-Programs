package kgcoding.challenge8;

public class Circle extends Shape{
    private final double radiusInCms;

    public double getRadiusInCms() {
        return radiusInCms;
    }

    public Circle(double radiusInCms){
        this.radiusInCms = radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radiusInCms;
    }
}
