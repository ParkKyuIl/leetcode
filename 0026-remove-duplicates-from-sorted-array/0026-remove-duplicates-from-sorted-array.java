class Solution {
    public int removeDuplicates(int[] nums) {
       int k = 1; // 첫번째 원소는 어짜피 유니크하니까 두번쨰 부터

       for(int i=0;i<nums.length-1;i++){
        if(nums[i] != nums[i+1]){
            nums[k++] = nums[i+1];
        }

       }
       return k;
    }
}