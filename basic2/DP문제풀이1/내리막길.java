package DP문제풀이1;

/**
 * Created by masinogns on 2017. 9. 7..
 *
 *
 * 좌 : i, j-1
 * 우 : i, j+1
 * 상 : i-1, j
 * 하 : i+1, j
 *
 *
 * if A[i][j] > A[][]
 *  A[i][j] += A[][]
 */
public class 내리막길 {
    public int solution(int N, int M, int[][] A) {
        int[][] D = new int[N+1][M+1];

        for (int i = 0; i <= N; i++) D[i][0] = 99999;
        for (int j = 0; j <= M; j++) D[0][j] = 99999;

        for (int i = 1; i < N; i++){
            for (int j = 1; j < M; j++){
                if (D[i][j] > D[i][j-1]) {
                    D[i][j] += D[i][j-1];
                }
                if (D[i][j] > D[i][j+1]) {
                    D[i][j] += D[i][j-1];
                }
                if (D[i][j] > D[i-1][j]) {
                    D[i][j] += D[i+1][j];
                }
                if (D[i][j] > D[i+1][j]) {
                    D[i][j] += D[i+1][j];
                }
            }
        }

        return 0;
    }
}
