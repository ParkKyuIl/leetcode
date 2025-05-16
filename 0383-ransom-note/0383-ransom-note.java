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

// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int[] rnct=new int[26];
//         int[] magct=new int[26];
//         for(char c:ransomNote.toCharArray()) rnct[c-'a']++;
//         for(char c:magazine.toCharArray()) magct[c-'a']++;
//         for(int i=0;i<26;i++) if(magct[i]<rnct[i]) return false;
//         return true;
//     }
// }