package ahut2020.day02;

import java.util.Scanner;

//输入一整行（可能含有空格) 统计数字，大写字母，小写字母，空格,其他符号的个数
public class P03CounterCharacterr {
    public static void main(String[] args) {
      //  String s="aklfsjkasdjklf%^^&*&*(  jsadfjkjklsdfs %$&*(*&(*()788778789";
        Scanner cin=new Scanner(System.in);
       // s=cin.next();//只能读取一个不含有空格的单词
       String  s=cin.nextLine();//读取一整行 包括空格
        char [] chars=s.toCharArray();//String->char[]
        int digit=0,upper=0,lower=0,space=0,other=0;
        for(int i=0;i<chars.length;i++){
            if(Character.isDigit(chars[i]))++digit;
            else if(Character.isUpperCase(chars[i]))++upper;
            else if(Character.isLowerCase(chars[i]))++lower;
            else if(Character.isSpace(chars[i]))++space;
            else other++;

        }
        System.out.println(String.format("%d %d %d %d %d",digit,upper,lower,space,other));
    }
}
