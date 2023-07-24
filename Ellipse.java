public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * (2 * (majorAxis + minorAxis) - Math.sqrt((majorAxis - minorAxis) * (majorAxis - minorAxis)));
    }

    @Override
    public double calculateArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}
