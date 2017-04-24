package palindrome;

/**
 * Created by 95232 on 2017/3/21.
 */
public class Solution {
    public boolean isPalindrom(int x){
        if(x<0){
            return false;
        }
        int quotient = x;
        int digits = 0;
        while(quotient!=0){
            quotient /=10;
            digits ++;
        }
        for(int i=1;i<=digits;i++){
            int high = digits -i +1;
            int low = i;
            if(getDigit(x,high)!=getDigit(x,low)){
                return false;
            }
        }
        return true;
    }
    public int getDigit(int x,int i){
        if(i==1){
            return x%10;
        }else {
            return (x/(int)Math.pow(10,i-1)%10);
        }
    }
}
