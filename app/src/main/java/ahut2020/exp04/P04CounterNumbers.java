package ahut2020.exp04;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class P04CounterNumbers {
    static class Node{
        int x;
        int cnt;
        Node(int x,int cnt){
            this.x=x;
            this.cnt=cnt;
        }

        @Override
        public String toString() {
            return String.format("%d:%d",x,cnt);
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        while (cin.hasNext()) {
            v.add(cin.nextInt());
        }
        Collections.sort(v);
        System.out.println(v);
        Vector<Node> nodes=new Vector<>();
        int cur = v.get(0), cnt = 1;
        for (int i = 1; i < v.size(); i++) {
            if (v.get(i) == cur) {
                ++cnt;
                continue;
            }
            nodes.add(new Node(cur,cnt));
            cur = v.get(i);
            cnt = 1;
        }
        nodes.add(new Node(cur,cnt));
        System.out.println(nodes);
        Collections.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if( o2.cnt-o1.cnt!=0)return o2.cnt-o1.cnt;
                return o1.x-o2.x;
            }
        });
        System.out.println(nodes.get(0));
    }
}
