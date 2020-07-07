package ahut2020.exp02;

import java.util.Arrays;
import java.util.Scanner;

public class P02ReverseEveryWord {
    public static void main(String[] args) {
        String s = "You think you can";
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            StringBuffer buffer = new StringBuffer(word);
            System.out.print(buffer.reverse() + " ");
        }
    }
}
//1：统计一篇文章中每一个字母出现的频率 Ctrl+Z/D 终止输入