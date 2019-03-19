/**
 * Square
 */
public class Square implements ShapeInterface {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }
}