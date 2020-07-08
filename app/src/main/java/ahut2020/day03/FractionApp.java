package ahut2020.day03;

public class FractionApp {
    public static void main(String[] args) {
        System.out.println(Fraction.gcd(6,8));//FractionApp.gcd(6,8)
        //1/1+1/2+1/3+1/4+...1/10;
        //int s=0;
        Fraction s=new Fraction();
        for(int i=1;i<=10;i++){
            Fraction f=new Fraction(1,i);
            s=s.add(f);
        }
        System.out.println(s);
    }
}
