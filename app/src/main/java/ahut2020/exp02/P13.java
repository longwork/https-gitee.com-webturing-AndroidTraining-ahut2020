package ahut2020.exp02;

import java.util.Arrays;

public class P13 {
    public static void main(String[] args) {
        String s = "There   are   apples;   oranges   and   peaches   on   the   table.  ".toLowerCase().trim();
        String[] words = s.split("[^a-z]+");
        System.out.println(Arrays.toString(words));

    }
}
