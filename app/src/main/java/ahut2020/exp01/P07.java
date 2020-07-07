package ahut2020.exp01;

import java.util.Arrays;

public class P07 {
    public static void main(String[] args) {
        int[] primers = new int[]{2, 3, 5, 7, 11, 13, 17};
        for (int a = 1; a <= 9; a++)
            for (int b = 0; b <= 9; b++)
                for (int c = 0; c <= 9; c++) {
                    int n = a * 100 + b * 10 + c;
                    if (a == b || a == c || b == c) continue;
                    if (b <= a + c) continue;
                    int pos = Arrays.binarySearch(primers, a + b);
                    if (pos >= 0) continue;
                    System.out.print(n + " ");

                }
    }
}
