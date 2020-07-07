package ahut2020.exp01;

public class P05 {
    private static final int N = 100;

    public static void main(String[] args) {
        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= N - x; y++) {
                int z = N - x - y;
                if (z % 9 != 0) continue;
                if (x * 2 + y * 4 + z / 9 * 2 != N) continue;
                System.out.println(x + " " + y + " " + z);
            }
        }
    }
}
