package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 4..
 *
 * 연산 3개
 *
 X가 3으로 나누어 떨어지면, 3으로 나눈다.
 X가 2로 나누어 떨어지면, 2로 나눈다.
 1을 뺀다.

 *연산 3개를 적절히 사용해서 1을 만드는 연산의 최소 값
 *
 * 나누어 떨어지는 수부터 나누기 시작하면 빨리 떨어지기 때문에 큰 수 부터 나눈다?
 * 10 /2-> 5 -1-> 4 /2-> 2 /2-> 1   (4번)
 * 10 -1-> 9 /3-> 3 /3-> 1          (3번)
 *
 * D[N] = N을 1로 만드는데 필요한 최소 연산
 *
 * N -> N/3 -> ... -> 1 = D[N]
 * N/3 -> ... -> 1 = D[N/3] = N/3을 1로 만드는데 필요한 최소 연산
 * N/2 -> ... -> 1 = D[N/2] = N/2을 1로 만드는데 필요한 최소 연산
 * N-1 -> ... -> 1 = D[N-1] = N-1을 1로 만드는데 필요한 최소 연산
 *
 *1. D[N] = D[N/3]+1
 *2. D[N] = D[N/2]+1
 *3. D[N] = D[N-1]+1
 *
 * D[N] = min(1,2,3)
 *
 * 1을 뺄경우와 2를 나눌경우 3을 나눌경우중 최소값을 찾는다.!!!
 *

 dp[i] = i를 1로 만드는 최소 연산 수

 dp[i] = min(dp[i-1], dp[i/2], dp[i/3])+1

 모든 연산을 마친 후 dp[i]를 출력하면 답!


 출처: http://6a68.tistory.com/6 [HH]

 solution 3개 뭐가 다른지 이해를 좀.
 */
public class 숫자1로만들기 {
    public int solution(int n) {

        int[] D = new int[n+1];

        D[1] = 0;

        for (int i = 2; i <= n; i++){
            D[i] = D[i-1]+1;

            if (i%2 == 0)
                D[i] = Math.min(D[i], D[i/2] + 1);

            if (i%3 == 0)
                D[i] = Math.min(D[i], D[i/3] + 1);
        }
        return D[n];
    }


    public int solution2(int n){
        int[] D = new int[n+1];

        D[1] = 0;

        for (int i = 2; i <= n; i++){
            D[i] = D[i-1]+1;

            if (i%2 == 0 && D[i]>D[i/2]+1)
                D[i] = D[i/2] + 1;

            if (i%3 == 0 && D[i]>D[i/3]+1)
                D[i] = D[i/3] + 1;
        }
        return D[n];
    }

    public int solution3(int n){
        int[] D = new int[n+1];
        int tmp1, tmp2, tmp3;

        D[1] = 0;

        for (int i = 2; i <= n; i++){
            tmp1 = 0;
            tmp2 = Integer.MAX_VALUE;
            tmp3 = Integer.MAX_VALUE;

            tmp1 = D[i-1]+1;

            if (i%2 == 0)
                tmp2 = D[i/2] + 1;

            if (i%3 == 0)
                tmp3 = D[i/3] + 1;

            D[i] = Math.min(tmp1, Math.min(tmp2, tmp3));
        }

        return D[n];
    }

    public static void main(String[] args) {
        숫자1로만들기 application = new 숫자1로만들기();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(application.solution(n));
    }
}
