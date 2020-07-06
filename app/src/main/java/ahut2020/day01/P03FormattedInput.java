package ahut2020.day01;

import java.util.Scanner;

/**
 * 格式化读取工具：扫描器类Scanner
 * 1. nextXXXX
 * 2. hasNextXXX
 */
public class P03FormattedInput {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int i1 = cin.nextInt();//十进制
        int i2 = cin.nextInt();
        float f1 = cin.nextFloat();
        double d1 = cin.nextDouble();
        String word = cin.next();
        String line = cin.nextLine();
        if (cin.hasNext()) {

        }
        cin.close();
    }
}
