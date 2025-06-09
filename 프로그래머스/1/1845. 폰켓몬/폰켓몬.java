import java.util.*;
class Solution {
    // 해쉬맵
    // 포켓몬의 유니크한 종류를 담는 해시맵 생성
    // 반복문으로 해시맵을
    
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set  = new HashSet<>();
        
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int size = set.size();
        
        if(size >= nums.length/2){
            return nums.length/2;
        }else{
            return size;
        }
        
    }
}