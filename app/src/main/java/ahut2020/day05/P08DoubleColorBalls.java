package ahut2020.day05;
import java.util.*;
public class P08DoubleColorBalls {
    public static void main(String[] args) {
        List<Integer> list=new Vector<Integer>();
        for(int i=1;i<=15;i++){
            list.add(i);
        }
        System.out.println(list);
        Collections.shuffle(list);

        List<Integer> firstPrize=new Vector<Integer>();
        firstPrize.addAll(list.subList(0,6));

        System.out.println("firstPrize="+firstPrize);
        for(int i=0;i<10000000;i++) {
            Collections.shuffle(list);
            List<Integer> user=list.subList(0,6);
            //System.err.println(user);
            if(user.equals(firstPrize)){
                System.out.println("First Prize!!!!");
            }
        }
    }
}
