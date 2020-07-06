package ahut2020.day01;

import java.util.Arrays;

public class P09ArraySearch {
    public static void main(String[] args) {
        int[] a=new int[]{1,3,5,7,9,3,4,6,7,9,123,4,5,67};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int key=67;
        int pos= Arrays.binarySearch(a,key);//二分查找使用前确保数组是有序的
        System.out.println(pos);//pos<0表示关键字不存在
    }
}
