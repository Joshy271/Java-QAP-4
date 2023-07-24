public class Triangle2 extends Shape2 implements Scalable {
    private double side1;
    private double side2;
    private double side3;

    public Triangle2(String name, double side1, double side2, double side3) {
        super(name);
        if (!isValidTriangle(side1, side2, side3)) {
            System.err.println("Invalid sides for a triangle: " + name);
            this.side1 = this.side2 = this.side3 = 0.0;
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
