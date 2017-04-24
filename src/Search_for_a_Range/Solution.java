package Search_for_a_Range;

/**
 * Created by 95232 on 2017/3/31.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * If A[mid] < target, then the range must begins on the right of mid (hence i = mid+1 for the next iteration)
 If A[mid] > target, it means the range must begins on the left of mid (j = mid-1)
 If A[mid] = target, then the range must begins on the left of or at mid (j= mid)
 */
public class Solution {
    public static void main(String[] args){
        List  sratch = new ArrayList();
        sratch.add("123");
        sratch.add(1);

        Iterator it =sratch.iterator();
        while (it.hasNext()){
            System.out.print(it.next().toString());
        }

        }
}
