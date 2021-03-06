package Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 95232 on 2017/3/28.
 */
public class generateParenthesis {
    public static void main(String[] args){
        List<String> list=generateParenthesis(4);
        System.out.println(list.toString());
    }


    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public static void backtrack(List<String> list, String str, int open, int close, int max){

        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }
}
