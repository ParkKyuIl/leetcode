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


// class Solution {
//     public boolean isPalindrome(int x) {
//         if (x<0 || (x!=0 && x%10==0)) return false;
//         int rev = 0;
//         while (x>rev){
//             rev = rev*10 + x%10;
//             x = x/10;
//         }
//         return (x==rev || x==rev/10);
//     }
// }