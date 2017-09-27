import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 12..
 *
 * 한 개의 2 by 2 판을 돌 때의 규칙
 * 1. 기준점 세팅
 * 2. 열+1
 * 3. 행+1
 * 4. 행+1, 열+1
 * 5. 기준점 변경
 *
 * N에 따라 변하는 기준점의 수
 * example{
 *     N = 1, piont number = 1
 *     N = 2, point number = 4 , 1 + 3
 *     N = 3, point number = 9 , 1 + 3 + 5
 *     N = 4, point number = 16, 1 + 3 + 5 + 7
 * }
 *
 * N에 따라 변하는 size
 * example{
 *     N = 1, size = 1*1*4 = 4
 *     N = 2, size = 2*2*4 = 16
 *     N = 3, size = 3*3*4 = 36
 *     ...
 *     size = N*N*4
 *
 *     세로 사이즈 N*2
 *     가로 사이즈 N*2
 * }
 *
 * 출처] :
 http://deliorange.tistory.com/96
 *
 */
public class Z_1074 {
    private int n, row, column;
    private int counter;
    private int ret;

    public int getRet() {
        counter = 0;
        return ret;
    }

    public void setN(int n) {
        this.n = (int) Math.pow(2, n);
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getN() {
        return n;
    }

    // n = Math.pow(2, n) = 2^n
    public void findOutRowColumn(int n, int startRow, int startColumn) {
        if (n == 2){
            if (startRow == row && startColumn == column){
                ret = counter;
                return;
            }
            counter++;

            if (startRow == row && startColumn + 1 == column){
                ret = counter;
                return;
            }
            counter++;

            if (startRow + 1 == row && startColumn == column){
                ret = counter;
                return;
            }
            counter++;

            if (startRow + 1 == row && startColumn + 1 == column){
                ret = counter;
                return;
            }
            counter++;

            return;
        }

        findOutRowColumn(n/2, startRow, startColumn);
        findOutRowColumn(n/2, startRow, startColumn+n/2);
        findOutRowColumn(n/2, startRow+n/2, startColumn);
        findOutRowColumn(n/2, startRow+n/2, startColumn+n/2);

    }

    public static void main(String[] args) {
        Z_1074 application = new Z_1074();

        Scanner scanner = new Scanner(System.in);
        int n, row, column;
        n = 0;
        row = 0;
        column = 0;

        n = scanner.nextInt();
        row = scanner.nextInt();
        column = scanner.nextInt();

        application.setN(n);
        application.setRow(row);
        application.setColumn(column);
        application.findOutRowColumn(application.getN(), 0, 0);
        System.out.println(application.getRet());
    }

}
