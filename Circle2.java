public class Circle2 extends Shape2 implements Scalable {
    private double radius;

    public Circle2(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }
}

