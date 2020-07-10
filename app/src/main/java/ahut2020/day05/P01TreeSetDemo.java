package ahut2020.day05;

import java.util.Set;
import java.util.TreeSet;
//TreeSet可以实现排序去重 所有操作的复杂度 find,add/remove 都是log(N) N是指满二叉树的节点数 树的的高度
public class P01TreeSetDemo {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 6, 3, 3};
        Set<Integer> S = new TreeSet<>();
        for (int e : a) {
            S.add(e);
        }
        System.out.println(S);

    }
}
