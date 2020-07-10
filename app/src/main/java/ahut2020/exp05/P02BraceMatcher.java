package ahut2020.exp05;

import java.util.Stack;

public class P02BraceMatcher {
    public static void main(String[] args) {
        boolean flag = check("(())[[]]");
        System.out.println(flag?"Yes":"No");
    }

    private static boolean check(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> S = new Stack<>();
        for (char ch : chars) {
            if (ch == '(' || ch == '[') {
                S.push(ch);
            } else if (ch == ')') {
                if (S.isEmpty() || S.peek() != '(')
                    return false;
                S.pop();
            }else if(ch==']'){
                if (S.isEmpty() || S.peek() != '[')
                    return false;
                S.pop();
            }
        }
        return S.isEmpty();
    }
}
