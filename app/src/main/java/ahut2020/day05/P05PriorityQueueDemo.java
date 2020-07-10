package ahut2020.day05;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class P05PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> Q=new PriorityQueue<Integer>();
        //Queue<Integer> Q=new LinkedList<>();//FIFO
        int [] a={1,3,5,7,9,2,4,6,8,0};
        for(Integer e:a){
            Q.offer(e);
        }
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.poll();
        }

    }
}
