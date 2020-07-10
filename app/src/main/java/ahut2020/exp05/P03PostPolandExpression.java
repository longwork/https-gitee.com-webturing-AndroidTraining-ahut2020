package ahut2020.exp05;

import java.util.Stack;

public class P03PostPolandExpression {
    public static void main(String[] args) {
        String[] tokens="1 2 + 3 4 + *".split(" ");
        Stack<Double> S=new Stack<Double>();
        for(String tok:tokens){
            if("+-*/".contains(tok)){
                Double b=S.peek();
                S.pop();
                Double a=S.peek();
                S.pop();
                double c=0;
                switch(tok.charAt(0)){
                    case '+':
                        c=a+b;
                        break;
                    case '*':
                        c=a*b;
                        break;
                    default:
                        break;
                }
                S.push(c);
            }else{
                S.push(Double.parseDouble(tok));
            }
        }
        System.out.println(S.peek());
    }
}
