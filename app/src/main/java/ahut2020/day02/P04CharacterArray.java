package ahut2020.day02;

import java.util.Arrays;

public class P04CharacterArray {
    public static void main(String[] args) {
        //char[] a={'J','a','v','a'};
        char [] a="ahut2020-AndroidProgramming".toCharArray();
        a[0]-=32;  a[1]-=32;
        a[2]-=32;
        a[3]-=32;
        System.out.println(a.length);
        System.out.println(a);
        Arrays.sort(a);
        System.out.println(a);
    }
}
