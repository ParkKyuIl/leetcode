import java.util.*;

class Solution {
    public int solution(int k, int[][] d) {
        int n = d.length, ans = 0;
        int[] idx = new int[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        do {
            int f = k, cnt = 0;
            for (int i : idx) {
                if (f >= d[i][0]) {
                    f -= d[i][1];
                    cnt++;
                } else break;
            }
            ans = Math.max(ans, cnt);
        } while (next(idx));
        return ans;
    }

    boolean next(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        if (i < 0) return false;
        int j = a.length - 1;
        while (a[j] <= a[i]) j--;
        swap(a, i, j);
        for (int l = i + 1, r = a.length - 1; l < r; l++, r--) swap(a, l, r);
        return true;
    }

    void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}
