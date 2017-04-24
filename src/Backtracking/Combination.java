package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 95232 on 2017/4/1.
 */
public class Combination {
    public static List<List<Integer>> Answer(int a[],int target){
        Arrays.sort(a);
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        deal(list,new ArrayList<Integer>(),a,target,0);
        return list;
    }
    public static void deal(List<List<Integer>> list,ArrayList templist,int a[],int target,int now){
        if(target<0){
            return;
        }else if(target==0){
            list.add(new ArrayList<>(templist));
        }else{
            for(int i=now;i<a.length;i++){
                templist.add(a[i]);
                deal(list,templist,a,target-a[i],i);
                templist.remove(templist.size()-1);
            }
        }
    }
    public static void main(String[] args){
        System.out.print(Answer(new int[]{2, 3, 6, 7},7).toString());
    }
}
