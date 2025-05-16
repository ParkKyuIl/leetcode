class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        return climb(n,memo);
    }

    private int climb(int n, int[] memo){
        if (n<=2) return n; // 베이스 케이스 설정

        if(memo[n] != 0) return memo[n]; // 메모 꺼내쓰는 구문

        memo[n] = climb(n-1,memo) + climb(n-2,memo); // n칸까지 가서 할수있는 경우의 수는 한칸을 오르거나 두칸을 오르는 경우밖에 없기떄문에 -1,-2 두개의 경우를 서로 더해준다


        return memo[n];

    }
}