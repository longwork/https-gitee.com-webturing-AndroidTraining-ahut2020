package ahut2020.day04;

import java.util.LinkedList;
import java.util.Queue;

public class P07QueueDemo {
    //Queue FIFO = First In First Out
    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<Integer>();
        for(int i=0;i<10;i++){
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.poll();
        }
    }
}
