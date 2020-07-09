package ahut2020.exp04;

import java.math.BigInteger;

public class P07Decimal2Binary {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);//21亿
        System.out.println(Long.MAX_VALUE);//2^63-1
        //System.out.println( Long.toBinaryString(123456789012345678901234567890));
        BigInteger b=new BigInteger("123456789012345678901234567890");
        System.out.println(b);
        System.out.println(b.add(b));
        System.out.println(b.subtract(b));
        System.out.println(b.multiply(b));
        System.out.println(b.pow(5));
        System.out.println(b.gcd(b));
        System.out.println(b.divide(new BigInteger("2")));
        System.out.println(b.toString(2));

    }
}
