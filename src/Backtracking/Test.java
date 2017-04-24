package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 95232 on 2017/4/1.
 */
public class Test {
    public static List sth(List<List<Integer>> list,List<Integer> sub){
        list.add(sub);
        return list;
    }
    public static void main(String[] args){
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        sub.add(1);
        sub.add(2);

        System.out.print(sth(list,sub).toString());
    }
}
