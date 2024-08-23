package in.kgcoding.challenge3.geometry;

public class Rectangle {
    public int length, breadth;

    public Rectangle(int length, int breadth){
        setLength(length);
        setBreadth(breadth);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length must be positive.");
        }
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        if (breadth <= 0) {
            throw new IllegalArgumentException("Breadth must be positive.");
        }
        this.breadth = breadth;
    }
}
