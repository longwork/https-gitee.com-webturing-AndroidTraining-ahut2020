package ahut2020.day04;

import java.util.Arrays;
import java.util.Scanner;

//从键盘上输入若干个整数，将其排序后，去掉重复的数再输出
public class P02Demo {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = new int[1];
        int j = 0;
        while (cin.hasNext()) {
            if (j == a.length) {//倍增容量 logn/n
                // System.out.println("--double capacity now--");
                int[] a2 = new int[a.length * 2];
                System.arraycopy(a, 0, a2, 0, a.length);
                a = a2;
            }
            a[j++] = cin.nextInt();
        }
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.sort(a, 0, j);
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
