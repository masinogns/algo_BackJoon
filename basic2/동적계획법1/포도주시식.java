package 동적계획법1;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 5..
 *
 * 이친수랑 비슷하게 풀 수 있다
 *
 * D[N][L] = A[1]부터 A[N] 포도주를 마신다. 연속 L잔
 * 가능한것은 D[N][0], D[N][1], D[N][2]
 * A[i] = i 번째 잔이 들어있는 포도주의 양
 *
 *
 * 점화식은 이렇게 세울 수 있다는데 이해하고 보아야 겠다 ㅎㅎ
 * D[N][0] = max(D[N-1][0], D[N-1][1], D[N-1][2])
 * D[N][1] = D[N-1][0] + A[N]
 * D[N][2] = D[N-1][1] + A[N]
 *  무슨말인지 모르겠고
 *
 *  1. n번째 포도주 마시지 않은 것
 *  2. n번째 포도주 마신 것
 *  3. n번째 포도주 마시고 n-1번째 포도주 마신것
*/
public class 포도주시식 {

    private static int Nothing = 0;
    private static int OneGlass = 1;
    private static int TwoGlass = 2;
    public long solution(int N, int[] wines) {

        long[][] D = new long[N+1][3];

        D[1][Nothing] = 0;
        D[1][OneGlass] = wines[0];
        if (N == 1)
            return Math.max(D[1][Nothing], D[1][OneGlass]);

        D[2][Nothing] = wines[0];
        D[2][OneGlass] = wines[1];
        D[2][TwoGlass] = D[1][OneGlass] + wines[1];

        if (N==2)
            return Math.max(Math.max(D[2][Nothing], D[2][OneGlass]), D[2][TwoGlass]);

        for (int n = 3; n <= N; n++){
            D[n][Nothing] = Math.max(Math.max(D[n-1][Nothing], D[n-1][OneGlass]), D[n-1][TwoGlass]);
            D[n][OneGlass] = D[n-1][Nothing] + wines[n-1];
            D[n][TwoGlass] = D[n-1][OneGlass] + wines[n-1];
        }

        long result = Math.max(Math.max(D[N][Nothing], D[N][OneGlass]), D[N][TwoGlass]);
        return result;
    }

    public static void main(String[] args) {
        포도주시식 application = new 포도주시식();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        int[] wines = new int[N];

        for (int i = 0; i < N; i++){
            wines[i] = scanner.nextInt();
        }

        System.out.println(application.solution(N, wines));
    }

}
