package ahut2020.exp05;

import java.util.LinkedList;

public class P04DecodeQQII {
    public static void main(String[] args) {
        LinkedList<Integer> L = new LinkedList<>();//Deque 双端队列
        for (int i = 13; i >= 1; i--) {
            if (L.size() > 1) {
                int t = L.getLast();
                L.pollLast();
                L.addFirst(t);
            }
            L.addFirst(i);
        }
        System.out.println(L);
    }

}
//## 4.解密QQ号II
//新学期开始了，小哈是小哼的新同，小哼向小哈询问QQ号，小哈当然不会直接告诉小哼。
// 所以小哈给了小哼一串加密过的数字，同时小哈也告诉了小哼解密规则。规则是这样的：
// 首先将第1个数删除，紧接着将第2个数放到这串数的末尾，再将第3个数删除并将第4个数再放到这串数的末尾
// ，再将第5个数删除……直到剩下最后一个数，将最后一个数也删除。按照刚才删除的顺序，把这些删除的数连在一起就是小哈的QQ啦。
// 现在你来帮帮小哼吧。小哈给小哼加密过的一串数是“6 3 1 7 5 8 9 2 4”。解密后小哈的QQ号应该是“6 1 5 9 4 7 2 8 3”。现在问题是要求输入解密结果，求出原来的序列
//输入
//输入解密结果第一个数是n代表随后有n个数字 代表了小哈解密后的数字
//输出
//第一个数字是序列的长度
//
//后面是小哼给他的原始序列每一个数字后面一个空格
//
//样例输入
//9
//6 1 5 9 4 7 2 8 3
//样例输出
//9
//6 3 1 7 5 8 9 2 4 