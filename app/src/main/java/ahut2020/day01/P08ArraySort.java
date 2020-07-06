package ahut2020.day01;

import java.util.Arrays;

public class P08ArraySort {
    public static void main(String[] args) {
        int[]a=new int[]{1,3,5,7,9,2,4,6,8,0};
        //Arrays.sort(a);
        Arrays.sort(a,2,7);//所排序是一个左闭右开的区间[2,7)
        System.out.println(Arrays.toString(a));
    }
}
