package kgcoding.challenge3.geometry;

//import kgcoding.challenge3.geometry.Circle;

public class CircleCalculator {
    /**
     * Calculates the area of the given circle.
     *
     * @param circle Circle object
     * @return Area of the circle as a double
     */
    public double calculateArea(Circle circle){
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    /**
     * Calculates the perimeter of the given circle.
     *
     * @param circle Circle object
     * @return Perimeter of the circle as a double
     */
    public double calculatePerimeter(Circle circle){
        return 2 * Math.PI * circle.getRadius();
    }
}
