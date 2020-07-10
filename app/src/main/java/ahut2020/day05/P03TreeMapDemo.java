package ahut2020.day05;

import java.util.Map;
import java.util.TreeMap;

public class P03TreeMapDemo {
    public static void main(String[] args) {
        int [] a=new int[]{1,1,6,3,3,};
        Map<Integer,Integer> M=new TreeMap<>();
        for(int e:a){
            if(M.containsKey(e)){
                int val=M.get(e);
                M.put(e,val+1);
            }else{
                M.put(e,1);
            }
        }
        System.out.println(M);
    }
}
