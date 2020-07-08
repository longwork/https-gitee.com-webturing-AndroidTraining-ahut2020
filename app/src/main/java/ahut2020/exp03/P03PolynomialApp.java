package ahut2020.exp03;

public class P03PolynomialApp {
    static class Polynomial {
        int n;
        int[] k;

        Polynomial() {
            this(0);
        }

        Polynomial(int n) {
            this.n = n;
            k = new int[n + 1];
            k[n] = 1;
        }

        Polynomial(int[] k) {
            if (k.length == 1) {
                n = 0;
                this.k = new int[n + 1];
                this.k[0] = k[0];
                return;
            }
            for (int i = k.length - 1; i >= 0; i--) {
                if (k[i] != 0) {
                    n = i;
                    break;
                }
            }
            if (n > 0) {
                this.k = new int[n + 1];
                for (int i = n; i >= 0; i--) {
                    this.k[i] = k[i];
                }
            }
        }

        @Override
        public String toString() {
            if (n == 0)
                return Integer.toString(k[0]);
            StringBuffer buf = new StringBuffer();
            for (int i = k.length - 1; i >= 0; i--) {
                int t = k[i];
                if (t == 0) continue;
                if (t < 0) {
                    buf.append("-");
                    t *= -1;
                } else {
                    buf.append("+");
                }
                if (t > 1) {
                    if (i == 0) {
                        buf.append(t);
                        continue;
                    }
                    if (i == 1) {
                        buf.append(t + "x");
                        continue;
                    }
                    buf.append(t + "x^" + i);
                    continue;
                }
                if (t == 1) {
                    if (i == 0) {
                        buf.append("1");
                        continue;
                    }
                    if (i == 1) {
                        buf.append("x");
                        continue;
                    }
                    buf.append("x^" + i);
                }
            }
            if (buf.charAt(0) == '+') return buf.substring(1).toString();
            return buf.toString();
        }

        Polynomial add(Polynomial that) {
            int n = Math.max(this.n, that.n);
            int[] k = new int[n + 1];
            for (int i = n; i >= 0; i--) {
                if (i > this.n) continue;
                k[i] += this.k[i];
                if (i > that.n) continue;
                k[i] += that.k[i];
            }
            return new Polynomial(k);

        }

        Polynomial mul(Polynomial that) {
            int n = this.n * that.n;
            int[] k = new int[n + 1];
            for (int i = 0; i <= this.n; i++)
                for (int j = 0; j <= that.n; j++) {
                    k[i + j] += this.k[i] * that.k[j];
                }
            return new Polynomial(k);
        }
    }

    public static void main(String[] args) {
        Polynomial p = new Polynomial(new int[]{1, -3, -5, 7, -9});
        System.out.println(p);
        Polynomial q = new Polynomial(new int[]{1, 2, 3, 4});
        System.out.println(q);
        System.out.println(p.add(q));
        System.out.println(p.mul(q));
    }
}
