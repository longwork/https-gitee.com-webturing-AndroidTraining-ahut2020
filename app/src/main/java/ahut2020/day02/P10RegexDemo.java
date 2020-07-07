package ahut2020.day02;

import java.util.Arrays;

public class P10RegexDemo {
    public static void main(String[] args) {
        String exp=" 1   +   2 - 1113 * 4 / 5  ";
        //String [] tok=exp.split("");//空串切割得到所有字母的列表
        System.out.println(Arrays.toString(exp.trim().split("\\s+")));
        System.out.println(Arrays.toString(exp.trim().split("\\s*\\d+\\s*")));
        System.out.println(Arrays.toString(exp.trim().split("\\s*\\D+\\s*")));


    }
}
