package ahut2020.day04;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class P03Vector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
          int x=cin.nextInt();
          if(v.indexOf(x)>=0){//contains
              continue;
          }
          v.add(x);
        }
        System.out.println(v);
        Collections.sort(v);

        System.out.println(v);//Arrays.toString(a);
        for(Integer i:v){//same with Array
            System.out.println(i);
        }
        for(int i=0;i<v.size();i++){//i<a.length;i++
            System.out.println(v.get(i));//v[i]
        }
        Iterator<Integer> it=v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        v.set(0,7);//a[0]=7
    }
}
