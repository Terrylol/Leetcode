package Frog_Jump;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 95232 on 2017/3/30.
 */

/**
 * 是动态规划，但是每一个石头下面放的是到达他的时候会走多少步才能到他；然后把这个东西-+操作
 * 放到下一组。
 */
public class Solution4 {
    public boolean canCross(int[] stones) {
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        for(int i=0;i<stones.length;i++){
            map.put(stones[i],new HashSet<Integer>());
        }
        map.get(0).add(0);
        for(int i=0;i<stones.length;i++){
            for (int k:map.get(stones[i])){
                for(int step = k-1;step<=k+1;step++){
                    if(step>0&&map.containsKey(stones[i]+step)){
                        map.get(stones[i]+step).add(step);
                    }
                }
            }
        }
        return map.get(stones[stones.length-1]).size()>0;
    }

    public boolean canAcross2(int[] stones){
        if(stones.length==0){
            return true;
        }
        HashMap<Integer,HashSet<Integer>> map = new HashMap<Integer,HashSet<Integer>>(stones.length);
        map.put(0,new HashSet<Integer>());
        map.get(0).add(1);
        for(int i=1;i<stones.length;i++){
            map.put(stones[i],new HashSet<Integer>());
        }
        for(int i=1;i<stones.length;i++){
            int stone = stones[i];
            for(int step:map.get(stone)){
                int reach = step+stone;
                if(reach == stones[stones.length-1]){
                    return true;
                }
                HashSet<Integer> set = map.get(stone+step);
                if(set != null){
                    set.add(step);
                    if(step-1>0) set.add(step-1);
                    set.add(step+1);
                }
            }
        }
        return false;
    }
}
