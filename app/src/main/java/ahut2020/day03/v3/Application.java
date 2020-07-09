package ahut2020.day03.v3;



public class Application {
    public static void main(String[] args) {
        Shape2D triangle=new Triangle(3,4,5);
        //triangle=null;
        Shape2D rectangle=new Rectangle(3,4);
        Shape2D circle=new Circle(5);
        Shape2D[] shapes={triangle,rectangle,circle};
        for(Shape2D shape:shapes){
            System.out.println(shape.area());
        }
        System.out.println(new Shape2D(){

            @Override
            public double area() {
                return 0;
            }

            @Override
            public double perimeter() {
                return 0;
            }
        });
    }
}
