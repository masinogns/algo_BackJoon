package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 2..
 *
 * N개의 집을 Red, Green, Blue를 이용하여 이웃집과 겹치지 않게 칠하는데 드는 최소 가격격 */
public class RGB거리 {
    private static int RED = 0;
    private static int GREEN = 1;
    private static int BLUE = 2;

    public int solution(int[][] array, int n) {
        int[][] cost = new int[n][3];

        cost[0][RED] = array[0][RED];
        cost[0][BLUE] = array[0][BLUE];
        cost[0][GREEN] = array[0][GREEN];

        for (int i = 1; i < n; i++ ){
            cost[i][RED] = Math.min(cost[i-1][BLUE], cost[i-1][GREEN]) + array[i][RED];
            cost[i][GREEN] = Math.min(cost[i-1][RED], cost[i-1][BLUE]) + array[i][GREEN];
            cost[i][BLUE] = Math.min(cost[i-1][RED], cost[i-1][GREEN]) + array[i][BLUE];
        }

        int result = Math.min(Math.min(cost[n-1][RED], cost[n-1][BLUE]), cost[n-1][GREEN]);

        return result;
    }

    public static void main(String[] args) {
        RGB거리 application = new RGB거리();
        Scanner scanner = new Scanner(System.in);
        int[][] array;

        int test = scanner.nextInt();
        scanner.nextLine();

        array = new int[test][3];

        for (int i = 0; i < test; i++){
            for(int j = 0; j < 3; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println(application.solution(array, test));

    }
}
