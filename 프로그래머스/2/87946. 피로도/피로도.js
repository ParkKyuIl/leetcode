function solution(k, dungeons) {
    const N = dungeons.length;
    let max = 0;

    function getP(k, visited, count) {
        if(max <= count) {
                max = count;
            }
        
//         if(Object.keys(visited).length === N) {
//             // 더 이상의 던전 탐색은 그만
//             return;
//         }

        // 0, 1 방문 시점
        for(let i = 0; i < N; i ++) {
            if(!visited[i]){
                
                if(k >= dungeons[i][0]) {
                    visited[i] = true;
                getP(k - dungeons[i][1], visited, count+1);
                   visited[i] = false;
                }
            }
        }
    }

    const visited={}
    getP(k, visited, 0);
    return max;
}