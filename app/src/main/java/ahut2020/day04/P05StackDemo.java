package ahut2020.day04;

import java.util.Stack;

public class P05StackDemo {
    public static void main(String[] args) {
        //Stack FILO =First In Last Out
        Stack<Integer> S=new Stack<Integer>();
        for(int i=0;i<10;i++){
            S.push(i);
        }
        while(!S.isEmpty()){
            System.out.println(S.peek());
            S.pop();
        }
    }
}
