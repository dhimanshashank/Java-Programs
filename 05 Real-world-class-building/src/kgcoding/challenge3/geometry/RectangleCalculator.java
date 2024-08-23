package in.kgcoding.challenge3.geometry;

public class RectangleCalculator {
    /**
     * Returns the area of the given rectangle.
     *
     * @param rectangle Rectangle object
     * @return Area of the rectangle as double
     */
    public double calculateArea(Rectangle rectangle){
        return rectangle.getLength() * rectangle.getBreadth();
    }

    /**
     * Returns the perimeter of the given rectangle.
     * @param rectangle Rectangle object
     * @return Perimeter of the rectangle as double
     */
    public double calculatePerimeter(Rectangle rectangle){
        return 2 * (rectangle.getLength() + rectangle.getBreadth());
    }
}
