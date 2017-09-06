package 동적계획법1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 6..
 */
public class 이동하기 {
    // 내가 푼 소스코드
    public int solution(int height, int width, int[][] Maze) {

        int[][] D = new int[height+1][width+1];

        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j++){
                if (i == 1 && j == 1)
                    D[i][j] = Maze[i-1][j-1];
                else if (i == 1)
                    D[i][j] = D[i][j-1] + Maze[i-1][j-1];
                else if (j == 1)
                    D[i][j] = D[i-1][j] + Maze[i-1][j-1];
                else{
                    D[i][j] = Math.max(Math.max(D[i][j-1], D[i-1][j]), D[i][j])+Maze[i-1][j-1];
                }
            }
        }
        return D[height][width];
    }

    public static void main(String[] args) {
        이동하기 application = new 이동하기();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), M = scanner.nextInt();
        int[][] Maze = new int[N][M];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                Maze[i][j] = scanner.nextInt();
            }
        }

        System.out.println(application.solution(N, M, Maze));
    }
}
