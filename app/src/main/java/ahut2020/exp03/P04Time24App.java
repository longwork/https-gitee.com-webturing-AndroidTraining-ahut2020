package ahut2020.exp03;

import java.util.Scanner;

class Time24{
    int hour,minute,second;

    public Time24(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        rationalize();
    }

     void rationalize() {
        int sc=0;
        sc=second/60;
        second%=60;
        minute+=sc;
        sc=minute/60;
        minute%=60;
        hour+=sc;
        hour%=24;
    }
    public Time24 add(Time24 that){
        int ch=this.hour+that.hour;
        int cm=this.minute+that.minute;
        int cs=this.second+that.second;
        return new Time24(ch,cm,cs);

    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

}
public class P04Time24App {
    public static void main(String[] args) {

        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int ah=cin.nextInt(),am=cin.nextInt(),as=cin.nextInt();
            int bh=cin.nextInt(),bm=cin.nextInt(),bs=cin.nextInt();
            Time24 a=new Time24(ah,am,as);
            Time24 b=new Time24(bh,bm,bs);
          // System.out.println(a);
          Time24 c=a.add(b);
           System.out.println(c);
        }
    }

}
