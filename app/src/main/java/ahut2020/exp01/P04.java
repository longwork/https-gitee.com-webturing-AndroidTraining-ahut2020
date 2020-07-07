package ahut2020.exp01;

public class P04 {
    public static void main(String[] args) {
        int N = 100;
        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= N; y++) {
                for (int z = 0; z <= N; z++) {
                    if (x + y + z == N && 3 * x + 5 * y + z / 2 == N && z % 2 == 0) {
                        System.out.println(x + " " + " " + y + " " + z);
                    }
                }
            }
        }
    }
}
