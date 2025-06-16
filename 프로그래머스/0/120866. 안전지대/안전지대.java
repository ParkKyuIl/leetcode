import java.util.*;
class Solution {
    
     private static final int[] DR = {-1,-1,-1, 0, 0, 1, 1, 1};
    private static final int[] DC = {-1, 0, 1,-1, 1,-1, 0, 1};
    public int solution(int[][] board) {
        int count = 0;
        int n = board.length;
        boolean[][] danger = new boolean[n][n];
        
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 1){
                    danger[i][j] = true;
                    for(int c=0;c<8;c++){
                        int new_i = i + DR[c];
                        int new_j = j + DC[c];
                        if(new_i >= 0 && new_i < n && new_j >=0 && new_j < n){
                             danger[new_i][new_j] = true;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 0 && danger[i][j] != true){
                    count++;
                }
            }
        }
        
     
       
        return count;
    }
}