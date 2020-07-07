package ahut2020.day02;
//

public class P02CharacterDemo2 {//#include<ctype.h>
    public static void main(String[] args) {
        char c=99;
        System.out.println(c);
        System.out.println(Character.isDigit(c));//48~57
        System.out.println(Character.isLowerCase(c));
        System.out.println(Character.isUpperCase(c));
        System.out.println(Character.isLetter(c));
        if(c<=122&&c>=97||c>=65&&c<=90){
            System.out.println("is Letter!");
        }
        System.out.println(Character.toLowerCase(c));
       // c-=32;


        System.out.println(Character.toUpperCase(c));
    }
}
