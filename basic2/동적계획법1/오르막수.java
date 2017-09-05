package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 5..
 *
 * 오르막수는 수의 자리가 오름차순인 수
 *

 * D[N][L] = D[N-1][L]+D[N-1][L-1] 땡..
 *
 * D[N] = D[N-1]0부터 L까지..
 * D[N] = D[N-1][0] + .... D[N-1][L]
 * D[N] = D[N-1][K] 0<=K<=L
 * */
public class 오르막수 {
    private int mod = 10007;

    public int solution(int N) {
        int[][] D = new int[N+1][11];

        for (int L = 0; L < 10; L++){
            D[1][L] = 1;
        }

        for (int n = 2; n <= N; n++){
            for (int L = 0; L < 10; L++){
                for (int K = 0; K <= L; K++){
                    D[n][L] += D[n-1][K];
                }

                D[n][L] %= mod;
            }
        }

        int sum = 0;

        for (int L = 0; L < 10; L++){
             sum += D[N][L];
        }

        return sum%mod;
    }

    public static void main(String[] args) {
        오르막수 application = new 오르막수();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(application.solution(N));
    }
}
