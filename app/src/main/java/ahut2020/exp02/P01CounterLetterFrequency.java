package ahut2020.exp02;

import java.util.Arrays;
import java.util.Scanner;

public class P01CounterLetterFrequency {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = new int[26];
        while (cin.hasNextLine()) {
            String s = cin.nextLine().toLowerCase().trim();
            if (s.equals("end")) {
                break;
            }
            for (char c : s.toCharArray()) {
                if(Character.isLetter(c))
                    a[c-'a']++;

            }
        }

        System.out.println(Arrays.toString(a));
    }
}
//1：统计一篇文章中每一个字母出现的频率 Ctrl+Z/D 终止输入