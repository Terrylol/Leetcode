package strStr;

/**
 * Created by 95232 on 2017/4/15.
 */
public class Solution {
    public int strstr (String haystact,String needle){
        for (int i=0;;i++){
            for(int j=0;;j++){
                if(j == needle.length())return i;
                if(i+j == haystact.length())return -1;
                if(needle.charAt(j)!= haystact.charAt(i+j)) break;
            }
        }
    }
}
