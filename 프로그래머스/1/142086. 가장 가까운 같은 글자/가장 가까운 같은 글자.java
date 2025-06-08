import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<String,Integer> map = new HashMap<>();
        String[] word = s.split("");
        int i = 0;
        for(String letter:word){
            if(!map.containsKey(letter)){
                answer[i] = -1;
                map.put(letter,i);
            }else{
              answer[i] = i - map.get(letter);
              map.put(letter,i);
            }
            i++;
        }
        return answer;
    }
}