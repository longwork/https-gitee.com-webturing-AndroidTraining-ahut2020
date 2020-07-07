package ahut2020.exp02;

public class P11 {
    static final int N = 64;

    public static void main(String[] args) {
        for (int x = N / 2; x <= N; x++) {
            for (int y = 0; y <= N / 2; y++) {
                for (int z = 0; z <= Math.min(N - x - y, N / 2); z++) {
                    int w = N - x - y - z;
                    int X = x, Y = y, Z = z, W = w;
                    X -= Y + Z + W;
                    Y *= 2;
                    Z *= 2;
                    W *= 2;
                    Y -= X + Z + W;
                    X *= 2;
                    Z *= 2;
                    W *= 2;
                    Z -= X + Y + W;
                    X *= 2;
                    Y *= 2;
                    W *= 2;
                    W -= X + Y + Z;
                    X *= 2;
                    Y *= 2;
                    Z *= 2;
                    if (X == N / 4 && Y == N / 4 && Z == N / 4 && W == N / 4)
                        System.out.println(String.format("%d %d %d %d", x, y, z, w));
                }
            }
        }
    }
}
