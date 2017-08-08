import java.util.Scanner;

/** 도저히 모르겠고
 * Created by masinogns on 2017. 8. 8..
 *
 * for example {
 * M : 10, N : 12
 *     해    날씨
 *          X:Y
 *     1)   1:1
 *     2)   2:2
 *     3)   3:3
 *     4)   4:4
 *     5)   5:5
 *     6)   6:6
 *     7)   7:7
 *     8)   8:8
 *     9)   9:9
 *     10)  10:10
 *     11)  1:11
 *     12)  2:12
 *     13)  3:1
 *     14)  4:2
 *     15)  5:3
 *     16)  6:4
 *     17)  7:5
 *     18)  8:6
 *     19)  9:7
 *     20)  10:8
 *     21)  1:9
 *     22)  2:10
 *     23)  3:11
 *     24)  4:12
 *     25)  5:1
 *     ...
 *     60)  10:12
 *
 *     M이 10이고 N이 12일 때, setYearOfXY()
 *     X:Y가 3:1일 때의 해는 K = 13 이다. getYearOfXY()
 * }
 *
 * //
 * if (x < m){
 *     x` = x+1
 * }else x` = 1
 *
 * if (y < n){
 *     y` = y+1
 * }else y` = 1
 *
 * 해 : K를 찾는 방법
 * 해가 K일 때 < X:Y >,
 * if(K%M != 0){
 *     X = K%M
 * }else{
 *     X = M
 * }
 *
 * if(K%N != 0){
 *     Y = K%N
 * }else{
 *     Y = N
 * }
 *
 *
 * 1. 테스트 케이스 숫자 입력
 * 2. 네 개의 정수 M, N, X, Y를 입력 받는다
 * 3. 마지막 해가 M, N일 때, X:Y 가 K번 째 해를 리턴하는 메소드를 만든다
 * - 만약 X:Y에 의해 표현되는 해가 없다면 -1을 출력한다
 *
 */
public class 카잉달력_6064 {
    int M, N;
    int X, Y;
    int[][] yearOfXY;
    Scanner scanner;

    public 카잉달력_6064() {
        scanner = new Scanner(System.in);
    }

    public int getM() {
        return M;
    }

    public void setM() {
        M = scanner.nextInt();
    }

    public int getN() {
        return N;
    }

    public void setN() {
        N = scanner.nextInt();
    }

    public int getX() {
        return X;
    }

    public void setX() {
        X = scanner.nextInt();
    }

    public int getY() {
        return Y;
    }

    public void setY() {
        Y = scanner.nextInt();
    }

    public static void main(String[] args) {
        카잉달력_6064 application = new 카잉달력_6064();

        Scanner scanner = new Scanner(System.in);

        int testcase = 0;

        testcase = scanner.nextInt();

        while (testcase > 0){
            application.setM();application.setN();  // 마지막 해 M:N
            application.setX();application.setY();  // X:Y

            application.setYearOfXY(
                    application.getM(), application.getN()
            );

            application.getYearOfXY(
                    application.getX(), application.getY()
            );


            testcase--;
        }


    }

    private void setYearOfXY(int m, int n) {
        yearOfXY = new int[m+1][n+1];
        int x, y;
        x = 1;
        y = 1;

        int year = 1;

        while (true){
            if (x<m && y<n){
                x +=1;
                y +=1;
            }else if (x<m && y==n){
                x +=1;
                y = 1;
            }else if (x==m && y<n){
                x = 1;
                y += 1;
            }else if (x==m && y==n){
                break;
            }else {
                x = 1;
                y = 1;
            }

            yearOfXY[x][y] = year;
            year++;
        }

        for (int i = 1 ; i < m+1; i++){
            for (int j = 1; j < n+1; j++){
                System.out.println(yearOfXY[i][j]);
            }
        }




    }

    private void getYearOfXY(int x, int y) {

    }
}
