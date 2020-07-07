package ahut2020.day02;

public class P01CharacterDemo {
    public static void main(String[] args) {
        for(int i=0;i<(1<<8);++i){
           System.out.print((char)i);

        }
        char s='程';
        System.out.println('\u0030');//30[16]=48[10]
        System.out.println((int)s);
        System.out.println(Integer.toHexString(31243));
        System.out.println('\u7a0b');

    }

}
