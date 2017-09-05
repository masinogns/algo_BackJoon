package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 4..
 *
 * 남아있는 붕어빵 N개
 * D[N] = N개의 붕어빵을 팔아서 수익을 최대로 만들기
 * 붕어빵 i개로 이루어진 세트 메뉴의 가격은 Pi원 이다
 *
 * D[N] = {
 *     D[N-1] + P[1]
 *     D[N-2] + P[2]
 *     D[N-3] + P[3]
 *     D[N-4] + P[4]
 * }
 *
 * D[N] = Max(D[N-i]+P[i])
 * 1 <= i <= N
 */
public class 붕어빵판매하기 {
    public int solution(int numberOfBakery, int[] array) {

        int[] D = new int[numberOfBakery+1];


        D[0] = 0;

        for (int n = 1; n <= numberOfBakery; n++) {
            for (int i = 1; i <= n; i++) {
                D[n] = Math.max(D[n-i]+array[i-1], D[n]);
            }
        }

        return D[numberOfBakery];
    }

    public static void main(String[] args) {
        붕어빵판매하기 application = new 붕어빵판매하기();

        Scanner scanner = new Scanner(System.in);

        int inputNumberOfBakery = scanner.nextInt();
        int[] P = new int[inputNumberOfBakery];

        for (int i = 0; i < inputNumberOfBakery; i++){
            P[i] = scanner.nextInt();
        }

        System.out.println(application.solution(inputNumberOfBakery, P));
    }
}
