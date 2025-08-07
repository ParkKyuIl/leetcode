import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 전체 일수
        int k = Integer.parseInt(st.nextToken());  // 연속 일수

        int[] psum = new int[n + 1];  // 누적합 배열
        int ret = Integer.MIN_VALUE; // 결과가 될 변수

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) { //전체 일수 만큼 반복
            int temp = Integer.parseInt(st.nextToken());
            psum[i] = psum[i - 1] + temp; // psum[i-1]의 -1은 그전 배열의 누적합을 반영하기 위함이며, 이를 위해 루프는 1부터 시작
        }
        // 누적합 배열 완성

        for (int i = k; i <= n; i++) { // (가장 헷갈렸던 부분) 누적합 배열에서 i번째의 원소에서 k를 빼면 i까지 누적합 된거에서 k이하의 누적합은 빼버리니
                                       // 결과적으로 i번째에서 딱 k만큼 앞에있는 원소까지의 누적합 만을 반영한다.
            ret = Math.max(ret, psum[i] - psum[i - k]);
        }

        System.out.println(ret);
    }
}
