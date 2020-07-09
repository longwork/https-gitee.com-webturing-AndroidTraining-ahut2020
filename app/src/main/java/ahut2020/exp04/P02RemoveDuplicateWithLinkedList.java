package ahut2020.exp04;

import java.util.*;
//## 去重排序，从键盘输入若干个数，最后降序输出不重复的数字（用Vector/LinkedList）
public class P02RemoveDuplicateWithLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int x = cin.nextInt();
            Iterator<Integer> it = list.iterator();
            boolean find = false;
            int index = 0;
            while (it.hasNext()) {
                int k = it.next();
                if (k <= x) {
                    if(k==x)find = true;
                    break;
                }
                ++index;
            }
            if (!find) {
                list.add(index, x);//O(1)
            }
        }
        System.out.println(list);
        Collections.reverse(list);

    }
}