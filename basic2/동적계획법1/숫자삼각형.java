package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 2..
 *
 * 최댓값을 구해나가는 방식은 선택한 값에서 왼쪽 대각선 아래 도는 오른쪽 대각선 아래로만 이동할 수 있다
 * == 선택한 값을 만드는 방법은 왼쪽 위의 값 또는 오른쪽 위의 값 중 큰 값을 고른 뒤 더해 나온 값
 *
 * D[i][0]은 위에 값이랑 더한다
 * D[i][i]는 왼쪽 대각선 값이랑 더한다
 * D[i][j] = Max(D[i-1][j], D[i-1][j+1]) + value[i][j]
 *
 */
public class 숫자삼각형 {
    public int solution(int[][] value, int n) {
        int[][] D = new int[n][n];

        D[0][0] = value[0][0];

        for (int i = 1; i < n; i++){
            D[i][0] = D[i-1][0] + value[i][0];
            D[i][i] = D[i-1][i-1] + value[i][i];

            if(i < 2)
                continue;

            for (int j = 1; j < i; j++){
                D[i][j] = Math.max(D[i-1][j], D[i-1][j-1]) + value[i][j];
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++){
            result = Math.max(D[n-1][i], result);
        }

        return result;
    }

    public static void main(String[] args) {
        숫자삼각형 application = new 숫자삼각형();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i+1; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println(application.solution(array, n));
    }
}
