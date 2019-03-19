public class ShapesApp {

    public static void main(String[] args) throws Exception {
        ShapeInterface triangle = new Triangle(15, 20, 12);
        ShapeInterface square = new Square(10);
        ShapeInterface rectangle = new Rectangle(5, 15);

        System.out.println("Kolmnurga ümbermõõt: " + triangle.getPerimeter() + " | pindala: " + triangle.getArea());
        System.out.println("Ruudu ümbermõõt: " + square.getPerimeter() + " | pindala: " + square.getArea());
        System.out.println("Ristküliku ümbermõõt: " + rectangle.getPerimeter() + " | pindala: " + rectangle.getArea());
    }
}