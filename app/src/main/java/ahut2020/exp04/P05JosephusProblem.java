package ahut2020.exp04;

import java.util.Iterator;
import java.util.LinkedList;

//## 出圈
//### 题目描述
//        设有n个人围坐一圈并按顺时针方向从1到n编号，从第1个人开始进行1到m的报数，报数到第个m人，此人出圈，再从他的下一个人重新开始1到m的报数，如此进行下去直到所剩下一人为止。
//        ##输入
//        输入多行，每行2个数，分别表示n和m.
//        ##输出
//        计算每一行中最后剩下这个人的编号．
//        ##样例输入
//        10 3
//        ##样例输出
//        4
public class P05JosephusProblem{
    public static void main(String[] args) {
        int n = 10, m = 3;
        LinkedList<Integer> L = new LinkedList<>();
        for (int i = 1; i <= n; i++) L.add(i);

        Iterator<Integer> iterator = L.iterator();
        while (L.size() > 1) {
            for (int cnt = 0; cnt < m; ++cnt) {
                if (iterator.hasNext()) {
                    iterator.next();
                } else {
                    iterator = L.iterator();
                    iterator.next();
                }
            }
            iterator.remove();
            System.err.println(L);
        }
        System.out.println(L.getFirst());

    }
}
