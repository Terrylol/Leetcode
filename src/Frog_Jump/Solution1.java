package Frog_Jump;

/**
 * Created by 95232 on 2017/3/30.
 */
public class Solution1 {
    public boolean canCross(int[] stones){
        return canCross(stones,0,0);
    }
    public boolean canCross(int[] stones,int ind,int jumpsize){
        for(int i = ind+1;i<stones.length;i++){
            int gap = stones[i]-stones[ind];
            if(gap>=jumpsize-1 && gap<=jumpsize+1){
                if(canCross(stones,i,gap)){
                    return true;
                }
            }
        }
        return ind == stones.length-1;
    }
}
