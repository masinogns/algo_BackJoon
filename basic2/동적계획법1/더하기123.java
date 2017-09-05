package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 4..
 *
 * D[N] = N을 1,2,3으로 나타내는 방법의 수
 * @ + @ + @ + ... + 1 = N
 * @ + @ + @ + ... + 2 = N
 * @ + @ + @ + ... + 3 = N
 */
public class 더하기123 {
    public int solution(int n) {

        int[] D = new int[n+1];

        if (n == 1) return 1;
        else if (n == 2) return 2;
        else if (n == 3) return 4;

        D[1] = 1;
        D[2] = 2;
        D[3] = 4;

        for (int i = 4; i <=n ; i++)
            D[i] = D[i-1]+D[i-2]+D[i-3];

        return D[n];
    }

    public static void main(String[] args) {
        더하기123 app = new 더하기123();
        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testcase; i++){
            System.out.println(app.solution(scanner.nextInt()));
        }
    }
}
