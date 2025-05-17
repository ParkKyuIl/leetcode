class Solution {
// BST
//     우리는 어떤 수 mid를 찾고 싶은 거야.
// mid * mid <= x인 가장 큰 mid를 찾는 것.
// 이진탐색으로 제곱근에 해당하는 mid를 찾자
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int answer = 0;

        while(left<=right){
            // 오버플로우를 막기위한 mid 계산법, left는 중간만큼 오른쪽으로 이동한다!
            int mid = left + (right-left) / 2;

            if((long)mid * mid <= x){
                answer = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return answer;
    }
}