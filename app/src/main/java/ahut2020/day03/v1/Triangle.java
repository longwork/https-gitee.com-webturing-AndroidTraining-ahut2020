package ahut2020.day03.v1;

public class Triangle extends Shape2D {
    public Triangle(double a  , double b, double c) {
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double a,b,c;

    @Override
    public double area() {
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
