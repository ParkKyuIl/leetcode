import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        // System.out.println(answer);
        Map<Character,Integer> map = new HashMap<>();
        
        for(String key:keymap){
            for(int i=0;i<key.length();i++){
                char c  = key.charAt(i);
                map.put(c,Math.min(map.getOrDefault(c,Integer.MAX_VALUE),i+1));
            }
        }
         int i=0;
        for(String word:targets){
           
            int sum = 0;
            for(char c: word.toCharArray()){
                if(!map.containsKey(c)){
                    sum = -1;
                    break;
                }
                sum += map.get(c);
            }
            answer[i] = sum;
            i++;
        }
        return answer;
    }
}