package ahut2020.day04;

import java.util.Stack;

//进制转化 n%r
public class P06StackApp {
    public static void main(String[] args) {
        Stack<Integer> S=new Stack<Integer>();
        int n=6;
        while(n>0){
            //System.out.print(n%2);
            S.push(n%2);
            n/=2;
        }
        while(!S.isEmpty()){
            System.out.print(S.peek());
            S.pop();
        }
    }
}
