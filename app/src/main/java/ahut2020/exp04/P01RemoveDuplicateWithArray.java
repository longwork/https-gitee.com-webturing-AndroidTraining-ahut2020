package ahut2020.exp04;

import java.util.Arrays;
import java.util.Scanner;

//去重排序，从键盘输入若干个数，最后降序输出不重复的数字（用数组实现）
public class P01RemoveDuplicateWithArray {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = new int[1];
        int j = 0;
        while (cin.hasNext()) {
            if (j == a.length) {//倍增容量 logn/n
                int[] a2 = new int[a.length * 2];
                System.arraycopy(a, 0, a2, 0, a.length);
                a = a2;
            }
            a[j++] = cin.nextInt();
        }

        Arrays.sort(a, 0, j);//排序
        for (int i = 0; i < j / 2; i++) {//翻转数组
            int t = a[i];
            a[i] = a[j - 1 - i];
            a[j - 1 - i] = t;
        }
        System.out.print(a[0]);

        int recent = a[0];
        for (int i = 1; i < j; i++) {
            if (a[i] == recent) {
                continue;
            }
            System.out.print(" " + a[i]);
            recent = a[i];
        }
        System.out.println();
    }
}
