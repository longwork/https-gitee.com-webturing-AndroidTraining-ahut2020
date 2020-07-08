package ahut2020.day03;

public class Fraction {
    public static void main(String[] args) {
        Fraction a = new Fraction(11, 33);
        System.out.println(a.toString());//println(Fraction)
        Fraction b = new Fraction(1, 6);
        System.out.println(b);
        Fraction c = a.add(b);
        System.out.println(c);

    }

    Fraction add(Fraction b) {
        Fraction c = new Fraction();
        c.up = this.up * b.down + this.down * b.up;
        c.down = this.down * b.down;
        int g = gcd(c.up, c.down);
        c.up /= g;
        c.down /= g;
        return c;
    }

    int up, down;

    @Override
    public String toString() {
        return String.format("%d/%d", this.up, this.down);
    }

    public Fraction(int up, int down) {
        int g = gcd(up, down);
        up /= g;
        down /= g;
        this.up = up;
        this.down = down;
    }

    public Fraction() {
        this(0, 1);
        // this.up=0;
        //  this.down=1;
    }

    static int gcd(int a, int b) {//
        return b == 0 ? a : gcd(b, a % b);
    }
}
