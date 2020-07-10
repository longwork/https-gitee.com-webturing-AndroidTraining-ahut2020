package ahut2020.exp05;

import java.util.PriorityQueue;
import java.util.Queue;

public class P07MovingFruits {
    public static void main(String[] args) {
        int [] a=new int[]{1,2,3,4,5};
    //Queue<Integer> Q=new PriorityQueue<>(5, Collections.reverseOrder());//大顶堆适合每次选出最大值
        Queue<Integer> Q=new PriorityQueue<>();
        for(int e:a){
            Q.offer(e);
        }
        long cost=0;
        while(Q.size()>1){
            int x=Q.peek();
            Q.poll();
            int y=Q.peek();
            Q.poll();
            Q.offer(x+y);
            cost+=x+y;
        }
        System.out.println(cost);


    }
}
//   ## 7.小明搬果子
//小明很想吃果子，正好果园果子熟了。在果园里，小明已经将所有的果子打了下来，而且按果子的不同种类分成了不同的堆。小明决定把所有的果子合成一堆。 因为小明比较懒，为了省力气，小明开始想点子了:
//每一次合并，小明可以把两堆果子合并到一起，消耗的体力等于两堆果子的重量之和。可以看出，所有的果子经过n-1次合并之后，就只剩下一堆了。小明在合并果子时总共消耗的体力等于每次合并所耗体力之和。
//　　因为还要花大力气把这些果子搬回家，所以小明在合并果子时要尽可能地节省体力。假定每个果子重量都为1，并且已知果子的种类数和每种果子的数目ai，你的任务是设计出合并的次序方案，使小明耗费的体力最少，并输出这个最小的体力耗费值。
//
//
//​
//输入
//输入第一行是一个整数n,1≤n≤10^6，表示果子的种类数。第二行包含n个整数，用空格分隔，第i个整数ai，1≤ai≤2×105是第i种果子的数目。
//输出
//输出每组测试数据输出包括一行，这一行只包含一个整数，也就是最小的体力耗费值。
//样例输入
//2
//1 2
//样例输出
//3
//提示
//　例如有3种果子，数目依次为1，2，9。可以先将1、2堆合并，新堆数目为3，耗费体力为3。接着，将新堆与原先的第三堆合并，又得到新的堆，数目为12，耗费体力为12。所以小明总共耗费体力=3+12=15。可以证明15为最小的体力耗费值。