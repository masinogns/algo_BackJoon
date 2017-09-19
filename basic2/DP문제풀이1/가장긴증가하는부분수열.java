package DP문제풀이1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 6..
 *
 *[3,2,5,2,3,1,4]
 * 어떠한 수열에서 일부 숫자를 지워서 만들 수 있는 새로운 수열을 그 수열의 부분 수열이라 합니다.
 * 가령 위의 수열에서 부분 수열은 [3], [5], [2,5], [3, 5, 3, 1], [2, 3, 4] 등이 있습니다..
 * 물론 이 수열 자체도 자기 자신의 부분 수열입니다.
 *
 * 서 증가하는 부분 수열은 [2, 5] , [3, 4] , [2, 3, 4] 등이 있습니다.

 최대의 값으로 자신의 최대 길이를 정하는 문제

 출처: http://seungkwan.tistory.com/8 [머리가 나쁘다] :: 문제 설명
 */
public class 가장긴증가하는부분수열 {
    public int solution(int N, int[] A) {

        int count = 1;

        for (int i = 0; i < N-1; i++){
            if (A[N-1-i] > A[N-2-i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        가장긴증가하는부분수열 controller = new 가장긴증가하는부분수열();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        System.out.println(controller.solution(N, A));

    }
}
