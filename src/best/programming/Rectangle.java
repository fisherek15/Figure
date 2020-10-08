package best.programming;

public class Rectangle implements Figure{

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.a + 2 * this.b;
    }

    @Override
    public double getArea() {
        return this.a * this.b;
    }
}
