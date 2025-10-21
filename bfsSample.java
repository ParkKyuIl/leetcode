import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

// -1,0 1,0 0,-1, 0,1
public class Main {
    static int N,M;
    static int[][] MAP;
    static int[][] DIST;
    static final int[] DY = {-1,1,0,0};
    static final int[] DX = {0,0,-1,1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 맵의 크기인 N,M을 입력받음
        M = Integer.parseInt(st.nextToken());

        MAP = new int[N][M];
        DIST = new int[N][M];

        st = new StringTokenizer(br.readLine());
        int sy = Integer.parseInt(st.nextToken()); // 승원이의 좌표 x,y
        int sx = Integer.parseInt(st.nextToken());
        int ty = Integer.parseInt(st.nextToken());  // 당근마켓의 좌표 x,y
        int tx = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String line = br.readLine().trim();
            if (line.indexOf(' ') >= 0) {
                st = new StringTokenizer(line);
                for (int j = 0; j < M; j++) MAP[i][j] = Integer.parseInt(st.nextToken());
            } else {
                for (int j = 0; j < M; j++) MAP[i][j] = line.charAt(j) - '0';
            }
        }

     

        System.out.println(bfs(sy,sx,ty,tx));

    }
    static int bfs(int sy, int sx, int ty, int tx){
        //입력받은 승원이의 좌표와 당근마켓의 좌표가 "맵에서 벗어났거나" "갈수 없는(바다)곳에 있거니" 하면 -1 리턴
        if(outOfMap(sy, sx) || outOfMap(ty, tx) || MAP[sy][sx] == 0 || MAP[ty][tx] == 0) return -1;


        //만약 승원이의 x,y 좌표가 당근마켓과 일치한다면(이미 도착했다면) 1 리턴
        if(sy == ty && sx == tx) return 1;


        // 혹시 몰라 DIST 배열 0으로 초기화
        for(int[] row: DIST){
            Arrays.fill(row,0);
        }

        //Queue X LinkedList보다 속도 빠른 ArrayDeque를 큐로 선언
        ArrayDeque<int[]> q = new ArrayDeque<>();
        // 시작할때 승원이가 서있는곳이 1이 되어야한다고 했으니 승원이가 서있는곳의 DIST를 1로 설정
        DIST[sy][sx] = 1;
        // 승원이의 xy좌표를 큐에 add
        q.add(new int[]{sy,sx});

        // BFS 큐가 빌때 까지 (모든 탐색 마칠때 까지)
        while(!q.isEmpty()){
            int[] cur = q.poll(); // 큐 앞을 꺼내서
            int y = cur[0] , x = cur[1]; // x,y 지역변수에 넣고

            for(int i=0;i<4;i++){ // 상하좌우 탐색 반복문 실행
                int ny = y + DY[i], nx = x + DX[i]; // 이동했을때의 좌표인 ny, nx를 새로 계산

                //만약 이동했을때의 좌표가 맵 밖이거나 갈수없는곳(바다)라면 큐에 넣지않고 continue;
                if(outOfMap(ny, nx) || MAP[ny][nx] == 0 || DIST[ny][nx] != 0) continue;

                // 이 시점에서 일단 이동할 좌표는 이동할수있는 곳이고(육지) DIST를 1 올리면서 큐에 넣을 준비를 한다.

                // DIST 1 증가
                DIST[ny][nx] = DIST[y][x] + 1;
                //만약 목적지라면 현재 이동할 좌표의 DIST 반환
                if(ny == ty && nx == tx) return DIST[ny][nx];
                // 아니라면 해당 좌표를 큐에 넣어 추가 탐색
                q.add(new int[]{ny,nx});

            }
        }

        return -1;
    }

    // 입력받은 좌표가 맵 밖으로 나갔는지 판단하는 부울 함수
    static boolean outOfMap(int y, int x){
        return 0 > y || y >= N || 0 > x || x >= M;
    }

}
