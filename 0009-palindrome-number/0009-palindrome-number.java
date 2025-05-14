class Solution {
    public boolean isPalindrome(int x) {
        String val = String.valueOf(x);
        int left = 0, right = val.length()-1;

        
        while(left < right){
            if(val.charAt(left) != val.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}


// class Solution {
//     public boolean isPalindrome(int x) {
// //             String value = String.valueOf(x);

//     StringBuilder sb = new StringBuilder(value);

//     return sb.reverse().toString().equals(value);

// }
// }