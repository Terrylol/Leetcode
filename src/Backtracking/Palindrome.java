package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 95232 on 2017/4/1.
 */
public class Palindrome {
    public List<List<String >> partition(String s){
        List<List<String>> list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),s,0);
        return list;
    }
    public void backtrack(List<List<String>> list,List<String> template,String s,int start){
        if(start==s.length())
        {
            list.add(new ArrayList<>(template));
        }else {
            for(int i=start;i<s.length();i++){
                if(isPalindrome(s,start,i)){
                    template.add(s.substring(start,i+1));
                    backtrack(list,template,s,i+1);
                    template.remove(template.size()-1);
                }
            }
        }
    }
    public boolean isPalindrome(String s, int low, int high){
        while(low < high)
            if(s.charAt(low++) != s.charAt(high--)) return false;
        return true;
    }
}
