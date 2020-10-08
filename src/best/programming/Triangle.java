package best.programming;

public class Triangle implements Figure{

    double a;
    double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + (Math.sqrt(this.a * this.a + this.b * this.b));
    }

    @Override
    public double getArea() {
        return (this.a * this.b) / 2.0;
    }
}
