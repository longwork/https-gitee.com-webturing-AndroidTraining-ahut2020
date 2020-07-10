package ahut2020.exp05;

import java.util.Arrays;
import java.util.Scanner;

public class P06MininiumProduction {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int n = cin.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < a.length; i++) a[i] = cin.nextInt();
            for (int i = 0; i < b.length; i++) b[i] = cin.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < b.length / 2; i++) {
                int t = b[i];
                b[i] = b[b.length - 1 - i];
                b[b.length - 1 - i] = t;
            }
            long s = 0;
            for (int i = 0; i < n; i++) {
                s += a[i] * b[i];
            }
            System.out.println(s);


        }
        cin.close();

    }
}
//   2
//   3
//           1  3  -5
//           -2  4  1
//           5
//           1  2  3  4  5
//           1  0  1  0  1