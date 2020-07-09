package ahut2020.day04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P04LinkedListDemo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        List<Integer> list=new LinkedList<Integer>();
       // List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<100000;i++){
            list.add(i);//int->Integer Boxing
        }
//        for(Integer i:list){
//            System.out.println(i);
//        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
       long end=System.currentTimeMillis();
        System.out.println((end-start)+"ms");

    }
}

