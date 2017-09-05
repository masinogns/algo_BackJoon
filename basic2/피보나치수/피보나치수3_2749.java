package 피보나치수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by masinogns on 2017. 9. 2..
 *
 *
 *  N = 10^18, 1,000,000로 나눈 나머지
 *  피보나치 수를 K로 나눈 나머지는 항상 주기를 가지게 된다, 피사노 주기 (Pisano Period)
 *  피보나치 수를 3으로 나누었을 때 주기의 길이는 8이다
 *
 *  주기의 길이가 P이면 N번째 피보나시 수를 M으로 나눈 나머지는
 *  N%P번째 피보나치수를 M을 나눈 나머지와 같다
 *  https://www.acmicpc.net/blog/view/28
 *
 *  한가지 Scanner를 이용하여 제출하니 런타임 에러가 나서

 BufferedReader를 사용하여 입력받으시면 될 겁니다.



 출처: http://nackwon.tistory.com/52 [JIMMY]
 *
 */
public class 피보나치수3_2749 {

    // 피보나치
    public int solution(int i) {
        long[] array = new long[i+1];

        array[1] = array[2] = 1;

        for (int a = 3; a <= i; a ++)
            array[a] = array[a-1] + array[a-2];

        return (int)array[i];
    }

    public int divideSolution(long n) {
        int mod = 10000000;
        int p = mod/10*15;

        long[] array = new long[p];

        array[1] = array[2] = 1;

        for (int i = 3; i < p; i ++){
            array[i] = array[i-1] + array[i-2];
            array[i] %= mod;
        }

        return (int)array[(int) (n%p)]%1000000;
    }

    public static void main(String[] args) {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));

        피보나치수3_2749 application = new 피보나치수3_2749();

    }
}
