package ahut2020.exp02;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        int k = s.length() % 3;
        if (k == 1) {
            s = "00" + s;
        } else if (k == 2) {
            s = "0" + s;
        }
        System.out.println(s);
        int n = s.length();
        int w = n / 3;
        String a = s.substring(0, w);
        String b = s.substring(w, 2 * w);
        String c = s.substring(2 * w);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int ia = Integer.parseInt(a);//String->int
        int ib = Integer.parseInt(b);
        int ic = Integer.parseInt(c);
        System.out.println(ia + ic - ib);

    }
}
