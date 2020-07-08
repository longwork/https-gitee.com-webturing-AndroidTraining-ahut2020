package ahut2020.exp03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class Point {
    int x, y;

    Point() {
        this(0);
    }

    Point(int x) {
        this(x, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",x,y);
    }

}
class MyComp implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        return o1.x-o2.x;//按照x的升序
    }
}
public class P02TestPoint {
    public static void main(String[] args) {
        Random rand=new Random();
        Point[] points=new Point[100];
        for(int i=0;i<points.length;i++){
            int x=rand.nextInt(100);
            int y=rand.nextInt(100);
            points[i]=new Point(x,y);
        }
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.y-o2.y;
            }
        });
        for(Point point:points){
            System.out.println(point);
        }
    }
}
