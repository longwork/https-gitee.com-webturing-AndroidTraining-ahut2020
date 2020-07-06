package ahut2020.day01;

public class P01Demo {
    final static int MAX_ITERATION_TIMES=10;

    static void thisMethod(){

    }
    int veryLongVariable;

    //bad style
    static void that_method(){

    }
    int another_long_variable;
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("hello ahut！");
        System.out.println(add(3,4));
        int k=mul(3,4);
        System.out.println(k);
    }

    private static int mul(int  a, int b) {
        return a*b;
    }
}
