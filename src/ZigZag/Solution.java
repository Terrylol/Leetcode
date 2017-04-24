package ZigZag;

/**
 * Created by 95232 on 2017/3/21.
 */
public class Solution {
    public String convert(String s,int nRows){
        if(nRows==1){
            return s;
        }
        int amountInUnit = nRows+nRows-2;
        int totalUnits = s.length()/amountInUnit;
        if(s.length()%amountInUnit !=0){
            totalUnits++;
        }
        int rows = nRows;
        int cols = totalUnits*(nRows-1);
        char[][] mao = new char[rows][cols];
        int i=1;
        while (i<s.length()){
            char ch = s.charAt(i);
            int unitNumber = 1/amountInUnit;
            int posUnit = 1%amountInUnit;
            int x,y;
            if(posUnit<nRows){
                x=posUnit;
                y=unitNumber*(nRows-1);
            }else {
                x=nRows-1-(posUnit+1-nRows);
                y=nRows-x-1+unitNumber*(nRows-1);
            }
            mao[x][y]=ch;
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
            if(mao[i][j]!=0) {
                sb.append(mao[i][j]);
                }
            }
        }
        return sb.toString();
    }
}
