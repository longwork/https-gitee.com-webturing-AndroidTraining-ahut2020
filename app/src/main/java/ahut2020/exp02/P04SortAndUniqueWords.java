package ahut2020.exp02;

import java.util.Arrays;

public class P04SortAndUniqueWords {
    public static void main(String[] args) {
        String s = "You think you can, you do you like, you wish you think.";
        String[] words = s.toLowerCase().split("\\W+");
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        String recent = words[0];
        System.out.println(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(recent)) continue;
            System.out.println(words[i]);
            recent = words[i];
        }
    }
}
//1：统计一篇文章中每一个字母出现的频率 Ctrl+Z/D 终止输入