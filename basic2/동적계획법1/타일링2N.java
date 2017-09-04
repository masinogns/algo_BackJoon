package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 4..
 *
 * D[N] = 2*N 직사각형을 채우는 방법을 구해라
 *
 * 2*N 맨 마지막이 2*1이 한개 들어가는 경우와 1*2가 2개 들어가는 경우가 있다
 * 2*1이 한개 들어가는 경우일 때에는 D[N-1]
 * 1*2이 두개 들어가는 경우일 때에는 D[N-2]
 *
 * 그래서 D[N] = D[N-1] + D[N-2]
 *
 * 피보나치 수열이랑 같은 개념인드드듯
 * N이 3일때까지 그려보고 피보나치 수열과 비슷한 개념이라는 것을 파악하는 것이 중요하다
 */
public class 타일링2N {
    public int solution(int n) {
        int[] D = new int[n+1];

        D[1] = 1;
        D[2] = 2;

        for (int i = 3; i <=n; i++)
            D[i] = (D[i-2] + D[i-1])%10007;

        return D[n];
    }

    public static void main(String[] args) {
        타일링2N application = new 타일링2N();

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(application.solution(number));
    }
}
