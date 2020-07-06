package ahut2020.day01;

public class P05StaticMethodPassValue {
    static void foo(int x){
        ++x;
    }
    public static void main(String[] args) {
        int x=3;
        foo(x);
        System.out.println(x);
        int a=3,b=4;
        swap(a,b);
        System.out.println(String.format("a=%d b=%d",a,b));

    }

    private static void swap(int a, int b) {
        int t=a;
        a=b;
        b=t;
    }
}
