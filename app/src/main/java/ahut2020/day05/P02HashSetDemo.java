package ahut2020.day05;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//HashSet可以去重 所有操作的复杂度 find,add/remove 都是O(1)
public class P02HashSetDemo {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 16, 23, 23};
        Set<Integer> S = new HashSet<>();
        for (int e : a) {
            S.add(e);
        }
        System.out.println(S);

    }
}
