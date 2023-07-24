
public abstract class Shape2{
    protected String name;

    public Shape2(String name) {
        this.name = name;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}
