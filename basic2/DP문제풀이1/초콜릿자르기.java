package DP문제풀이1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 7..
 *
 * D[N][M] = 세로가 N이고 가로가 M인 초콜릿을 1*1로 다 만드는 최소의 경우의 수
 *
 */
public class 초콜릿자르기 {
    public int solution(int N, int M) {

        return N*M-1;
    }

    public static void main(String[] args) {
        초콜릿자르기 controller = new 초콜릿자르기();

        Scanner scanner = new Scanner(System.in);

        System.out.println(controller.solution(scanner.nextInt(), scanner.nextInt()));
    }
}
