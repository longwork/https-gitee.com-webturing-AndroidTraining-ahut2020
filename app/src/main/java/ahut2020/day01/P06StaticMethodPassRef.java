package ahut2020.day01;

import java.util.Arrays;

public class P06StaticMethodPassRef {
    static void foo(int [] a){//非基本数据类型都是引用传递（包括基本数据类型的数组类型）
        ++a[0];

    }
    public static void main(String[] args) {
        int[] a=new int[]{3,2,1};
       foo(a);
        System.out.println(a);//直接打印是数组的hashCode [I@4d7e1886
        //利用索引来遍历（可以修改，但是比较麻烦
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //用for_each顺序只读访问
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
        //直接用Arrays.toString(arr)
        System.out.println(Arrays.toString(a));

    }


}
