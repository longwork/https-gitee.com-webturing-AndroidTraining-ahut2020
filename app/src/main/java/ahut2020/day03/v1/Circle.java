package ahut2020.day03.v1;

public class Circle extends Shape2D {
    public Circle(double r) {
        super();
        this.r=r;
    }
    double r;

    @Override
    public double area() {
        return Math.PI*r*r;
    }
}
