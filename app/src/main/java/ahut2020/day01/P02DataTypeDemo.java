package ahut2020.day01;

/**
 * int包装器Integer类的API
 * 1.数值范围[Integer.MIN_VALUE,Integer.MAX_VALUE]//2^31-1
 * 2. 进制转化
 * 3. 字符串类型的解析parser
 *
 */
public class P02DataTypeDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int x=20200706;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        String s="1234";
        int y=Integer.parseInt(s,5);
        System.out.println(y);
    }
}
