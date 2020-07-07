package ahut2020.exp01;
//1.	随机产生一些1—100之间的整数，直到产生的数为50为止。
public class P01 {
    public static void main(String[] args) {
        int start = 1, end = 100, target = 50;
        int tot = 0;
        while (true) {
            ++tot;
            int k = (int) ((end - start + 1) * Math.random()) + start;
            System.out.print(k + " ");
            if (k == target) {
                break;
            }
        }
        System.out.println(tot);

    }
}
