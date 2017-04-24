package Valid_Parentheses;

import java.util.Stack;

/**
 * Created by 95232 on 2017/3/31.
 */
public class Solution1 {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char c :s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push((']'));
            }else if(stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
