package ahut2020.exp02;

public class P10 {
    public static void main(String[] args) {
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                if (b == a) continue;
                int c = 6 - a - b;

                int ap = (b == 2 && c == 2) ? 1 : 0, aq = (a == 1) ? 1 : 0;
                int bp = (b <= 2) ? 1 : 0, bq = (c == 3) ? 1 : 0;
                int cp = (a != 2) ? 1 : 0, cq = (b != 1) ? 1 : 0;
                if (a + ap + aq == 3 && b + bp + bq == 3 && c + cp + cq == 3)
                    System.out.println(String.format("%d %d %d", a, b, c));
            }
        }
    }
}
