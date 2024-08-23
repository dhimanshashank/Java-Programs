package in.kgcoding.challenge3.geometry;

public class Circle {
    private double radius;

    // Constructor for setting the radius
    public Circle(double radius){
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Radius must be positive..");
        }
        this.radius = radius;
    }
}


// ----------------- ENCAPSULATION --------------------
