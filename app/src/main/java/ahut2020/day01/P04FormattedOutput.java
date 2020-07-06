package ahut2020.day01;

import java.util.Scanner;

/**
 *
 */
public class P04FormattedOutput {
    public static void main(String[] args) {
        double x = Math.PI;
        System.out.println(x);
        System.out.printf("%.2f\n", x);
        System.out.println(String.format("%.3f", x));
        System.err.println(String.format("%.4f", x));
    }
}
