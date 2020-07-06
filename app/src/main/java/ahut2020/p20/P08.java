package ahut2020.p20;

public class P08 {
    public static void main(String[] args) {
        for (int i = 0; i < (1 << 5); i++) {
            int a = (i >> 4) & 1;
            int b = (i >> 3) & 1;
            int c = (i >> 2) & 1;
            int d = (i >> 1) & 1;
            int e = i & 1;

            if (a + b + c + d + e != 3) continue;   //要他们中的3个人去完成。
            if (a == 1 && c == 1) continue;// 已知：（1）A、C不能都去；
            if (b + c == 0) continue;// （2）B、C不能都不去；
            if (c == 1 && d + e != 1) continue;// （3）如果C去了，D、E就只能去一个，且必须去一个；
            if (b + c + d == 3) continue;// （4）B、C、D不能都去；
            if (b == 1 && d + e == 2) continue;// （5）如果B去了，D、E就不能都去。
            System.out.println(String.format("%d%d%d%d%d", a, b, c, d, e));
        }
    }
}
