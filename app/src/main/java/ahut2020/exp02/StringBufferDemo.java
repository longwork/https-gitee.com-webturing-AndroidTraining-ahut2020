package ahut2020.exp02;

import java.util.Arrays;
import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String[] args) {
        String s = "hello";
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        System.out.println(t);
        t = new StringBuffer(s).reverse().toString();
        System.out.println(t);
    }
}
//1：统计一篇文章中每一个字母出现的频率 Ctrl+Z/D 终止输入