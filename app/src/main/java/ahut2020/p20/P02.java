package ahut2020.p20;

public class P02 {
    public static void main(String[] args) {
        int start = 1, end = 1000, k = 15;
        int tot = 0;
        for (int i = start; i <= end; i++) {
            if (i % k == 0) {
                tot += k;
            }
        }
        System.out.println(tot);
    }
}
