package ahut2020.day02;

public class P09StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer();
        System.out.println(buffer.hashCode());
//        buffer.append("test");
//        System.out.println(buffer.hashCode());
        for(int i=1;i<=100000;i++)
        {
            buffer.append(i);
        }
        System.out.println(buffer.toString().charAt(2020));
    }
}
