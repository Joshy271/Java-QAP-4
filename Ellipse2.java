public class Ellipse2 extends Shape2 implements Scalable {
    private double majorAxis;
    private double minorAxis;

    public Ellipse2(String name, double majorAxis, double minorAxis) {
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

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }
}
