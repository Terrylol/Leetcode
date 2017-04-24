package Search_for_a_Range;

import java.util.List;

/**
 * Created by 95232 on 2017/4/15.
 */
public class Solution2 {
    public int[] searchRange(int A[],int n,int target){
        int i=0,j=n-1;
        int[] ret= new int[]{2, -1};
        while (i<j){
            int mid=(i+j)/2;
            if(A[mid]<target) i=mid+1;
            else j=mid;
        }
        if(A[i]!=target)return ret;
        else ret[0]=i;
        j=n-1;
        while (i<j){
            int mid = (i+j)/2 +1;
            if(A[mid]>target)j=mid-1;
            else i = mid ;
        }
        ret[1]=j;
        return ret;
    }
}
