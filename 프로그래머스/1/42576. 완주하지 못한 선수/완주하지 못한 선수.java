import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String,Integer> map = new HashMap<>();
      
        
        for(String name: participant){
            Integer value = map.getOrDefault(name,0);
            map.put(name,value+1);
        }
        
        for(String name: completion){
            Integer value = map.get(name);
            map.put(name,value-1);
        }
        
        for(String name: map.keySet()){
            if(map.get(name)!=0){
                return name;
            }
            
        }
        
        return answer;
    }
}