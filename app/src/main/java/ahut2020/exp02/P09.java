package ahut2020.exp02;

import java.util.Arrays;

public class P09 {
    public static void main(String[] args) {
        String s = "A123X456Y7A，302ATB567BC";
        String[] nums = s.split("\\D+");
        System.out.println(Arrays.toString(nums));
        String t = s.replaceAll("\\D+", " ");
        System.out.println(t.trim());
    }
}
