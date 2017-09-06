package DP문제풀이1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 6..
 *
 * 2*N 배열에 사자를 배치하는 경우의 수가 몇 가지
 * 사자들을 우리에 가둘 때, 가로로도 세로로도 붙어 있게 배치할 수는 없다.
 * 사자를 한 마리도 배치하지 않는 경우도 하나의 경우의 수로 친다고 가정한다.\
 *
 * 아무것도 없는 경우 D[N][Nothing]
 * 왼쪽에만 있는 경우 D[N][ExistLeft]
 * 오른쪽에만 있는 경우 D[N][ExistRight]
 *
 * D[n] = n행까지 사자를 배치할 수 있는 최대 경우의 수
 */
public class 동물원 {

    private static int Nothing = 0;
    private static int ExistLeft = 1;
    private static int ExistRight = 2;

    public int solution(int N) {
        int mod = 9901;

        int[][] D = new int[N+1][3];

        D[1][Nothing] = 1;
        D[1][ExistLeft] = 1;
        D[1][ExistRight] = 1;

        for (int n = 2; n <= N; n++){
            D[n][Nothing] = (D[n-1][Nothing]+ D[n-1][ExistRight] + D[n-1][ExistLeft])%mod;
            D[n][ExistRight] = (D[n-1][Nothing] + D[n-1][ExistLeft])%mod;
            D[n][ExistLeft] = (D[n-1][Nothing] + D[n-1][ExistRight])%mod;
        }


        int other = D[N][Nothing]+D[N][ExistLeft]+D[N][ExistRight];

        other %= mod;

        return other;
    }

    public static void main(String[] args) {
        동물원 controller = new 동물원();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(controller.solution(N));
    }
}
