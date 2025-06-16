
import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] virtualSpace = new int[201];
        
        for(int i=0;i<3;i++){
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            
            for(int j = start;j<end;j++){
                virtualSpace[j]++;
            }
            
        }
        
           for(int point: virtualSpace){
                if(point > 1){
                    answer++;
                }
            }
        return answer;
    }
}