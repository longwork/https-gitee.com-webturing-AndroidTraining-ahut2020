package ahut2020.exp03;
class Fraction{
    Fraction add(Fraction b) {
        Fraction c = new Fraction();
        c.up = this.up * b.down + this.down * b.up;
        c.down = this.down * b.down;
        long g = gcd(c.up, c.down);
        c.up /= g;
        c.down /= g;
        return c;
    }

    long up, down;

    @Override
    public String toString() {
        return String.format("%d/%d", this.up, this.down);
    }

    public Fraction(long up, long down) {
        long g = gcd(up, down);
        up /= g;
        down /= g;
        this.up = up;
        this.down = down;
    }

    public Fraction() {
        this(0, 1);

    }

    static long gcd(long a, long b) {//
        return b == 0 ? a : gcd(b, a % b);
    }
}
public class P01FractionApp {
    public static void main(String[] args) {
        System.out.println(1l*150000*50000);
        Fraction s=new Fraction();
        for(int i=1;i<=200;i++){
            s=s.add(new Fraction(1,i));
        }
        System.out.println(s);
    }
}
