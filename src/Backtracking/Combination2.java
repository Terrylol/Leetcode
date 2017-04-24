package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 95232 on 2017/4/1.
 */
public class Combination2 {
    public List combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;

    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) list.add(tempList);
        else{
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i-1]) {
                    continue; // skip duplicates
                }
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    public static void main(String[] args){
        List<List<Integer>> list =new Combination2().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5},8);

        System.out.print(list.toString());
        System.out.print("123");
    }
}
