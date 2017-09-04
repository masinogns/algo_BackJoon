package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 3..
 *
 * 두번째 계단을 밟았을 때 최대값 {
 *     첫 번째 계단 밟고 두 번째 계단 밟았을 때 (step 1 * 2)
 *     첫 번째 계단 밟지 않고 두 번째 계단 밟았을 때 (step 2)
 * }
 *
 * 세번째 계단을 밟았을 때 최대값 {
 *     첫 번째 계단 밟고 2단 점프했을 때(step 1 + step 2)
 *     두 번째 계단 밟고 1단 점프했을 때(step 2 + step 1)
 * }
 *
 * N번째 계단을 밟는 방법의 수{
 *     1. N-2번째 계단에서 2단 점프해서 N번째 계단을 밟는 방법 (2step)
 *     2. N-3번째 계단에서 2단 점프하고 N-1번째 계단에서 1단 점프하는 방법(2step+1step)
 * }
 *
 * D[N] = Math.max(D[N-2], D[N-3]+D[N-1]) + value[N] 땡 !!
 *
 * https://lyzqm.blogspot.kr/2017/03/2579.html
 * 참고 url
 *
 *  DP[N][M] :  M계단을 올라갈때 N번째 계단 까지의 총 점수의 최댓값
 *  D[N번째 계단을 밟을 때][계단을 몇번 점프해서 오르느냐]
 */
public class 계단오르기 {
    private static int STEP1 = 0;
    private static int STEP2 = 1;

    public int solution(int[] value, int n) {
        int[][] D = new int[n][2];

        D[0][STEP1] = value[0];
        D[0][STEP2] = 0;

        if (n >= 1){
            D[1][STEP1] = value[1]+value[0];
            D[1][STEP2] = value[1];
        }

        for (int i = 2; i < n; i++){

            D[i][STEP1] = D[i-1][STEP2] + value[i];
            D[i][STEP2] = Math.max(D[i-2][STEP1], D[i-2][STEP2]) + value[i];
        }

        return Math.max(D[n-1][STEP1], D[n-1][STEP2]);
    }

    public static void main(String[] args) {
        계단오르기 application = new 계단오르기();
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        scanner.nextLine();

        int[] array = new int[test];

        for (int i = 0; i < test; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println(application.solution(array, test));
    }

}
