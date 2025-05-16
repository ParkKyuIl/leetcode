class Solution {
    public boolean isPalindrome(String s) {
        String trimmedString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int length = trimmedString.length();
      
        for(int i=0;i<length;i++){
            if(trimmedString.charAt(i) != trimmedString.charAt(length-i-1)){
                return false;
            }
        }


        return true;
    }
}