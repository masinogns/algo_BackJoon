package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 5..
 *
 * 이진수 = 0과 1로만 이루엊니 수
 * 이친수 = 이진수 중에 특별한 성질 , 0으로 시작하지 않는다 1이 두 번 연속으로 나타나지 않는다.
 *
 *
 * D[N][L] = N자리 이친수, 마지막 L 수
 *
 * 0 앞에는 0, 1 둘 다 올 수 있다
 * 1 앞에는 0이 올 수 있다
 *
 * D[N][0] = D[N-1][0] + D[N-1][1]
 * D[N][1] = D[N-1][0]
 *
 * -0-0-----
 *
 * D[N] = N자리 이친수
 * D[N] = D[N-1] + D[N-2]
 *
 * 마지막 자리가 0일 경우 D[N-1]
 * 마지막 자리가 1일 경우 D[N-2]
 *
 *  == 피보나치랑 같네
 *  90을 입력해봄

 쓰레기값이 나옴.

 long형이나 더 큰 자료형을 써야



 출처: http://dyndy.tistory.com/165 [DY N DY]
 *
 */
public class 이친수 {

    private static int LastElementIsZero = 0;
    private static int LastElementIsOne = 1;

    public int solution(int N) {
        int[][] D = new int[N+1][2];

        D[1][LastElementIsZero] = 1;
        D[1][LastElementIsOne] = 1;

        for (int n = 2 ; n <= N; n++){
            D[n][LastElementIsZero] = D[n-1][LastElementIsZero] + D[n-1][LastElementIsOne];
            D[n][LastElementIsOne] = D[n-1][LastElementIsZero];
        }


        return D[N][LastElementIsOne];
    }

    /**
     * n = 1 ; 1
     * n = 2 ; 10
     * n = 3 ; 100, 101
     * n = 4 ; 10 [00, 01, 10]
     */

    public long solution2(int N){
        long[] D = new long[N+1];

        if (N == 1)
            return 1;

        if (N == 2)
            return 1;

        D[1] = 1;
        D[2] = 1;

        for (int i = 3; i <= N; i++){
            D[i] = D[i-1] + D[i-2];
        }
        return D[N];
    }
    public static void main(String[] args) {
        이친수 application = new 이친수();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(application.solution(N));
    }
}
