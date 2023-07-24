public class Demo2 {
    public static void main(String[] args) {
        Scalable[] shapes = new Scalable[4];
        shapes[0] = new Circle2("Circle", 5.0);
        shapes[1] = new Ellipse2("Ellipse", 8.0, 4.0);
        shapes[2] = new Triangle2("Triangle", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle2("Equilateral Triangle", 6.0);

        // Print shapes before scaling
        System.out.println("Shapes before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale the shapes
        double scaleFactor = 1.5;
        scaleShapes(shapes, scaleFactor);

        // Print shapes after scaling
        System.out.println("\nShapes after scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
