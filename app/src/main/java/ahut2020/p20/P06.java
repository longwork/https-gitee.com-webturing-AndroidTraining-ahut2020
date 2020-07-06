package ahut2020.p20;

public class P06 {
    static boolean right(int x, int y) {//x在y的右侧才为true
        return x + 1 == y || y == 1 && x == 5;
    }

    static boolean left(int x, int y) {
        return right(y, x);
    }

    static boolean near(int x, int y) {
        return right(x, y) || left(x, y);
    }

    public static void main(String[] args) {
        int zhao = 1;
        int qian, sun, li, zhou;
        for (qian = 2; qian <= 5; ++qian) {
            for (sun = 2; sun <= 5; ++sun) {
                if (qian == sun) continue;
                for (li = 2; li <= 5; ++li) {
                    if (li == sun || li == qian) continue;
                    zhou = 15 - zhao - qian - sun - li;
                    if (near(zhao, qian)) continue;
                    if (left(sun, qian) || left(li, qian)) continue;
                    if (left(qian, sun)) continue;
                    if (near(li, sun)) continue;
                    System.out.println(String.format("%d %d %d %d %d", zhao, qian, sun, li, zhou));
                }
            }
        }
    }
}
