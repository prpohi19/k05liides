/**
 * Triangle
 */
public class Triangle implements ShapeInterface {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws Exception {
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new Exception("Impossible triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        // Heron's Formula
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}