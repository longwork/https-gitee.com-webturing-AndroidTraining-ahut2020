package ahut2020.exp01;

public class P04b {
    public static void main(String[] args) {
        int N = 100;
        for (int x = 0; x <= N / 3; x++) {
            for (int y = 0; y <= Math.min(N - x, (N - 3 * x) / 2); y++) {
                int z = N - x - y;
                if (x + y + z == N && 3 * x + 2 * y + z / 2 == N && z % 2 == 0) {
                    System.out.println(x + " " + " " + y + " " + z);
                }

            }
        }
    }
}
