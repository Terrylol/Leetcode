package Frog_Jump;

import java.util.Arrays;

/**
 * Created by 95232 on 2017/3/30.
 */
public class Solution2 {
    public boolean canCross(int[] stones){
        int [][] memo = new int[stones.length][stones.length];
        for(int[] row :memo){
            Arrays.fill(row,-1);
        }
        return can_cross(stones,0,0,memo)==1;
    }
    public int can_cross(int[] stones,int ind,int jumpsize,int[][] memo){
        if(memo[ind][jumpsize] >=0){
            return memo[ind][jumpsize];
        }
        for (int i=ind+1;i<stones.length;i++){
            int gap = stones[i]-stones[ind];
            if(gap>=jumpsize-1&&gap<=jumpsize+1){
                if(can_cross(stones,i,gap,memo)==1){
                    memo[ind][gap]=1;
                    return 1;
                }
            }
        }
        memo[ind][jumpsize]=(ind==stones.length-1)?1:0;
        return memo[ind][jumpsize];
    }
}
