
public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}

