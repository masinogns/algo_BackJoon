package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 5..
 *
 * 계단 수 = 인접한 모든 자리수의 차이가 +-1
 *
 * 길이가 N인 계단 수
 *
 * N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램 0으로 시작하는 수는 없다
 *
 * D[N] = 길이가 N인 계단수의 총 갯수
 *
 * n=1 일 때 1 ~ 9 까지의 수
 * n=2 일 때 {
 *     10, 12
 *     21, 23
 *     32, 34
 *     ...
 * }
 *
 * 규칙을 발견해보자!
 *
 * D[N][L] = 길이가 N인 계단수, 마지막 수가 L이다
 *
 * ------------------
 * ...........L-1 , L
 * ...........L+1 , L
 *
 * 즉 D[N][L] = D[N-1][L-1] + D[N-1][L+1]
 *
 * 숫자가 크다보니 sum의 숫자는 int가 아닌 long으로 변환한 후에 처리 후 int로 cast해줘야한다
 *
 */
public class 쉬운계단수 {
    private int mod = 1000000000;

    public int solution(int n) {
        int[][] D = new int[n+1][10];

        for (int i = 1; i < 10; i++)
            D[1][i] = 1;

        for (int i = 2; i <=n; i++){
            for (int l = 0; l <= 9; l++){
                if (l == 0)
                    D[i][0] = D[i-1][1] % mod;
                else if (l == 9)
                    D[i][9] =D[i-1][8] % mod;
                else
                    D[i][l] = (D[i-1][l-1]+D[i-1][l+1]) % mod;
            }
        }

        long sum = 0;
        //sum
        for (int i = 0; i < 10; i++){
            sum += D[n][i];
        }

        return (int) (sum %= mod);
    }

    public static void main(String[] args) {
        쉬운계단수 application = new 쉬운계단수();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(application.solution(N));
    }
}
