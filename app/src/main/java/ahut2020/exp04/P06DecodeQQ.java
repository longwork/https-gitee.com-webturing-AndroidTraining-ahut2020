package ahut2020.exp04;

import java.util.LinkedList;
import java.util.Queue;

public class P06DecodeQQ {
    public static void main(String[] args) {
        int [] arr=new int[]{6,3,1,7,5,8,9,2,4};
        Queue<Integer> Q=new LinkedList<Integer>();
        for(Integer i:arr){
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            System.out.print(Q.peek());
            Q.poll();
            if(Q.isEmpty()){
                break;
            }
            int x=Q.peek();
            Q.poll();
            Q.offer(x);
        }
    }
}
//## 解密QQ号
//        新学期开始了，小哈是小哼的新同，小哼向小哈询问QQ号，小哈当然不会直接告诉小哼。
// 所以小哈给了小哼一串加密过的数字，同时小哈也告诉了小哼解密规则。规则是这样的：首先将第1个数删除，
// 紧接着将第2个数放到这串数的末尾，再将第3个数删除并将第4个数再放到这串数的末尾，再将第5个数删除……
// 直到剩下最后一个数，将最后一个数也删除。按照刚才删除的顺序，把这些删除的数连在一起就是小哈的QQ啦。
// 现在你来帮帮小哼吧。小哈给小哼加密过的一串数是“6 3 1 7 5 8 9 2 4”。
// 解密后小哈的QQ号应该是“6 1 5 9 4 7 2 8 3”。
//        ###输入
//        只有2行 第1行有一个整数n （1<=n<=100000） 第2行有n个整数为加密过的QQ号，每个整数之间用空格隔开。每个整数在1~9之间。
//        ###输出
//        只有一行，输出解密后的QQ号。
//        ### 样例输入
//        9
//        6 3 1 7 5 8 9 2 4
//        ### 样例输出
//        6 1 5 9 4 7 2 8 3