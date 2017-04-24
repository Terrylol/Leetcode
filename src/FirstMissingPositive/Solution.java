package FirstMissingPositive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 95232 on 2017/3/31.
 */
public class Solution {
    //每一回合都尽量把有用的数字送出去。
//    直到每个数组对应的数字是一个没有价值的垃圾数字，然后就表示这个数字没用。
//    也就等于这个格子是空的。
    public static int firstMissingPositive(int[] A){
        int i=0;
        while (i<A.length){

            if(A[i]==i+1 ||A[i]<=0 ||A[i]>A.length)i++;
            else if(A[A[i]-1] != A[i])swap(Arrays.asList(A).get(0),i,A[i]-1);
            else i++;
        }
        i=0;
        while (i<A.length && A[i]==i+1)i++;
        return i+1;
    }
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void main(String[] args) {
        int[] a={3,4,2,1};
        int b = firstMissingPositive(a);
    }

    }
