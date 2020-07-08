package ahut2020.day03.v1;

public class Rectangle extends Shape2D {
    public Rectangle(double a, double b) {
        super();
        this.a=a;
        this.b=b;
    }
    double a,b;

    @Override
    public double area() {
        return a*b;
    }
}
