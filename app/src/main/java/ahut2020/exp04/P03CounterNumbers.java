package ahut2020.exp04;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
//## 数字统计：从键盘上输入若干个数，从小到大输出每一个数和他的频率
public class P03CounterNumbers {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        while (cin.hasNext()) {
            v.add(cin.nextInt());
        }
        Collections.sort(v);
        System.out.println(v);
        int cur = v.get(0), cnt = 1;
        for (int i = 1; i < v.size(); i++) {
            if (v.get(i) == cur) {
                ++cnt;
                continue;
            }
            System.out.println(cur + " " + cnt);
            cur = v.get(i);
            cnt = 1;
        }
        System.out.println(cur + " " + cnt);
    }
}
