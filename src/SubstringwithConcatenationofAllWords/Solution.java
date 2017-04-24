package SubstringwithConcatenationofAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 95232 on 2017/4/15.
 */
public class Solution {
    public static List<Integer> findSubString(String S, String[] L){
        List<Integer> res = new ArrayList<Integer>();
        if(S==null ||L==null||L.length==0)return res;
        int len = L[0].length();
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String w:L){
            map.put(w,map.containsKey(w)? map.get(w)+1:1);
        }
        for(int i=0;i<=S.length()-len*L.length;i++){
            Map<String,Integer> copy = new HashMap<String,Integer>(map);
            for(int j=0;j<L.length;j++){
                String str = S.substring(i+j*len,i+j*len+len);
                if(copy.containsKey(str)){
                    int count = copy.get(str);
                    if(count==1)copy.remove(str);
                    else copy.put(str,count-1);
                    if(copy.isEmpty()){
                        res.add(i);
                        break;
                    }
                }else break;
            }
        }
        return res;
    }
    public static void main(String[] args){
        String S = "barfoothefoobarman";
        String[] L =  {"foo", "bar"};
        List<Integer> ans = findSubString(S,L);
        System.out.print(ans.toString());
    }
}
