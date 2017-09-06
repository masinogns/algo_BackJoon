package DP문제풀이1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 6..
 *
 * VIP회원들은 자기 좌석에만 앉아야 한다
 * 고정 좌석은 바로 왼쪽 좌석 또는 오른쪽 좌석으로 옮길 수 있다
 *
 *
 * 좌석 번호, 입장권 번호
 * ArrayM에는 고정좌석의 번호
 *
 * D[좌석번호][입장권번호]
 * D[입장권번호][좌석번]
 *
 * 합의 법칙 - 두 사건 A,B가 있을 때 동시에 일어나지 않았을 경우, 두 사건의 경우의 수를 각 각 더한다
 * 곱의 법칙 - 두 사건 A,B가 있을 때 동시에 일어날 경우, 두 사건의 경우의 수를 곱한다
 *
 * D[N] = N의 좌석의 모든 경우의 수, 배치할 수 있는 모든 경우의 수
 *
 * 좌석을 좌우로만 바궈 배치할 수 있는 경우의 수는 피보나치 수열이 된다
 *
 * 접근방식 : VIP석으로 인해 나눠진 남은 좌석들에 대해 각각 배치할 수 있는 경우의 수를 구한다
 * 이 후 이 수들을 모두 곱하여 나온 값이 답이 된다
 *
 *
*/
public class 극장좌석 {
    public int solution(int N, int VIPNumber, int[] VIP) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i ++) queue.offer(i);

        int result = 1;
        // 범위 나누기
        for (int v = 0; v < VIPNumber; v++){
            int count = 0;

            for (int i = 1; i <=N; i++){
                if (VIP[v] == queue.peek()){
                    queue.poll();
                    break;
                }

                count++;
                queue.poll();
            }

            result *= fibo(count);
        }

        //나머지 배열 계산
        result *= fibo(queue.size());

        return result;
    }

    // 나눈 범위의 배치 경우의 수 구하기 = 피보나치
    public int fibo(int N) {
        int[] fibo = new int[N+1];

        fibo[1] = 1;
        if (N == 1) return 1;
        fibo[2] = 2;
        if (N == 2) return 2;

        for (int i = 3; i < fibo.length; i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
        }

        return fibo[N];
    }

    public static void main(String[] args) {
        극장좌석 controller = new 극장좌석();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int VIPNUMBER = scanner.nextInt();
        int[] VIP = new int[VIPNUMBER];

        for (int i = 0; i < VIPNUMBER; i++){
            VIP[i] = scanner.nextInt();
        }
        System.out.println(controller.solution(N, VIPNUMBER, VIP));
    }


}
