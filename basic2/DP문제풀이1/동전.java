package DP문제풀이1;

/**
 * Created by masinogns on 2017. 9. 7..
 *
 * D[동전을 N개 썼을 때][원하는 수를 만드는 경우의 수]
 * D[3][10] : 동전을 3개 썼을 때 숫자 10을 만드는 경우의 수
 *
 *
 * Dynamic Programming으로 접근한다.
 첫 번째 동전만 사용하여 각 k값 마다 가능한 경우의 수를 찾는다.
 첫 번째~두 번째 동전만 사용하였을 때, 각k 값 마다 가능한 경우의 수를 찾는다.
 이 때, 첫 번째 동전만 사용해서 구했던 경우의 수를 활용한다.
 첫 번째~n 번째 동전을 사용하였을 때까지 반복한다.

 A[i] = i coin value
 D[i][k] = make vlaue K using i coin position
 =============================================
 일단 2차원 풀이법부터 설명해보자면, dp[n][k] = n 종류의 동전으로 k원을 만드는 경우의 수라고 정의할때 dp[n][k]를 구하는 방법은 두가지이다.
 1. dp[n][k-coin[n]] = n번째 동전을 사용한 뒤 k원을 만들수 있는 경우의 수
 2. dp[n-1][k] = n번째 동전을 사용하지 않고 k원을 만들수 있는 경우의 수
 이렇게 되므로 점화식은 $ dp[n][k] = dp[n][k-coin[n]] + dp[n-1][k] $가 된다.
 출처: http://b.mystika.me/7 [Mystika+Algorithm]
 */
public class 동전 {
    public int solution(int N, int K, int[] A) {
        int[][] D = new int[N+1][K+1];


        for (int i = 1; i <= K; i++){
            D[1][i] = 1;
        }


        for (int i = 1; i < N; i++){
            D[N][K] += D[N-i][K-A[N-i]];
        }

        return D[N][K];
    }
}
