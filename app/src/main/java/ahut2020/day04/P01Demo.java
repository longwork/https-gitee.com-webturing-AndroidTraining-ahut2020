package ahut2020.day04;

import java.util.Scanner;

//从键盘上输入若干个整数，将其排序后，去掉重复的数再输出
public class P01Demo {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = new int[10];
        int j = 0;
        while (cin.hasNext()) {
            a[j++] = cin.nextInt();
        }
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
