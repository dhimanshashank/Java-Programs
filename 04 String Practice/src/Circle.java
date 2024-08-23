import java.util.Scanner;

public class Circle {
    double radiusInMm;

    Circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    double getCircumference(){
        return 2 * Math.PI * radiusInMm;
    }

    double getArea(){
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "\nCircle properties{ " +
                "\n\tRadius in MM: " + radiusInMm +
                ", \n\tCircumference in MM: " + getCircumference() +
                ", \n\tArea in MM: " + getArea() +
                " \n}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Circle World...\n");
        System.out.print("Please enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle myCircle = new Circle(radius);
        System.out.println(myCircle);

/*        double circumference = myCircle.getCircumference();
        double area = myCircle.getArea();
        System.out.printf("The circumference of your circle is: %f\nThe area of your circle is: %f", circumference, area); */
    }
}
