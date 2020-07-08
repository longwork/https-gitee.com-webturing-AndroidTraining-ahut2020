package ahut2020.day03.v1;

public class Application {
    public static void main(String[] args) {
        Shape2D triangle=new Triangle(3,4,5);
        Shape2D rectangle=new Rectangle(3,4);
        Shape2D circle=new Circle(5);
        Shape2D[] shapes={triangle,rectangle,circle};
        for(Shape2D shape:shapes){
            System.out.println(shape.area());
        }
    }
}
