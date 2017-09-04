package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 4..
 *
 * D[N] = D[N-1] + D[N-2] + D[N-2]
 */
public class 타일링2N2 {
    public int solution(int n) {
        int[] D = new int[n+1];

        D[1] = 1;
        D[2] = 3;

        for (int i = 3; i <= n; i++)
            D[i] = (D[i-1]+(D[i-2]*2)) % 10007;

        return D[n];
    }

    public static void main(String[] args) {
        타일링2N2 application = new 타일링2N2();

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(application.solution(number));
    }
}
