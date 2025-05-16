class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for(char s: magazine.toCharArray()){
            map.put(s,map.getOrDefault(s,0) + 1);
        }
     
        for(char s: ransomNote.toCharArray()){

            if(!map.containsKey(s) || map.get(s) == 0){
                return false;
            }else{
                map.put(s,map.get(s)-1);
            }
        }


    return true;
    }
}