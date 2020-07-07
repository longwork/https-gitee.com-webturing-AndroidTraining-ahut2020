package ahut2020.day02;

import java.util.Scanner;

//用户输入两行字符串 s,t 查找在忽略大小写情况下 t出现的位置和次数
//多次匹配
public class P08StringAPIApplication {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine().toLowerCase();
        String t = cin.next().toLowerCase();
        int pos = 0;
        int tot=0;
        while (( pos = s.indexOf(t, pos)) >= 0) {
            System.out.println(pos);
            pos += t.length();//pos++
            ++tot;
        }
        System.out.println(tot);
    }
}
