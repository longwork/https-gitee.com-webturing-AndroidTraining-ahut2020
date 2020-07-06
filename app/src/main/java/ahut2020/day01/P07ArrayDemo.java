package ahut2020.day01;

import java.util.Arrays;

public class P07ArrayDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int [] arr2=new int[]{1,2,3,4};
        int [] arr3=arr2;//arr3与arr2共享同一内存 浅拷贝
        ++arr[0];
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("arr2="+Arrays.toString(arr2));
        System.out.println("arr3="+Arrays.toString(arr2));
        arr2[0]+=100;
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("arr2="+Arrays.toString(arr2));
        System.out.println("arr3="+Arrays.toString(arr2));
        //hashCode
        System.out.println("arr.hashCode()="+arr.hashCode());
        System.out.println("arr2.hashCode()="+arr2.hashCode());
        System.out.println("arr3.hashCode()="+arr3.hashCode());
        //完整的克隆一个数组，得到一个独立的副本
        int[] arr4=arr2.clone();

        int[] arr5=new int[arr2.length];
        System.arraycopy(arr2,0,arr5,0,arr2.length);

    }
}
