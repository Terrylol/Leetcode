package Sudoku;

import java.util.HashSet;

/**
 * Created by 95232 on 2017/3/21.
 */
public class Solution {
    public boolean isValidSudoku(char[][] board){
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < board.length; i++) {
            set.clear();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.' && !set.add(board[i][j]))
                    return false;
            }
        }

        // check columns
        for (int j = 0; j < board.length; j++) {
            set.clear();
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] != '.' && !set.add(board[i][j]))
                    return false;
            }
        }
        int totalBox = board.length/3;
        for (int p=0;p<totalBox;p++){
            for (int q=0;q<totalBox;q++){
                set.clear();
                for(int i=p*3;i<p*3+3;i++){
                    for(int j=q*3;j<q*3+3;q++){
                        if(board[i][j]!='.' && !set.add(board[i][j]))
                            return false;
                    }
                }
            }
        }
        return true;
    }

}
