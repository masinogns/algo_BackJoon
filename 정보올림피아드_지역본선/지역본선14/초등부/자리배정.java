package 지역본선14.초등부;

/**
 * Created by masinogns on 2017. 9. 19..
 */
class Position{
    int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getPosition(){
        return new int[]{x, y};
    }
}

public class 자리배정 {
    public int[] solution(int column, int row, int k) {

        Position[] positions = new Position[column*row+1];
        int ret = 0;

        if (column*row < k)
            return new int[]{0};

//        exeMakeArray(3);     // 달팽이 배열을 보여준다
        positions = makeArray(row,column, positions);

        for (int i = 1; i < column*row ; i++){
            System.out.print(positions[i].getX()+" "+positions[i].getY());
            System.out.println();
        }
        return positions[k].getPosition();
    }

    private Position[] makeArray(int 행, int 열, Position[] positions){
        int[][] arr = new int[행+1][열+1];

        int value = 1;
        int row = 1, column = 0;
        int inc = 1;
        int x, y;

        positions[0] = new Position(0, 0);
        while (행 > 0 && 열 > 0){
            for (y = 0; y < 열; y++){
                column += inc;
                arr[row][column] = value;
                positions[value] = new Position(row, column);
                value++;
            }

            열--;
            if (열 == 0) break;


            for (x = 0; x < 행-1; x++){
                row += inc;
                arr[row][column] = value;
                positions[value] = new Position(row, column);
                value++;
            }
            inc *= -1;

            행--;
            if (행 == 0) break;
        }


        return positions;

    }

    private void exeMakeArray(int n) {
        int[][] arr = new int[n][n];
        arr = makeArr(n, arr);

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // 배열의 크기 n을 받는다
    private int[][] makeArr(int n, int[][] arr){
        int value = 1;              //배열을 채워 나갈 값
        int row = 0, col = -1;       // 행row 열col을 나타내는 index
        int increase = 1;           // index의 증가량으로 1 또는 -1을 갖는다

        int i;

        while (n > 0){
            for (i = 0; i < n; i++){    // 열 index를 increase만큼 증가시킨다 increase가 -1이면 감소
                col+=increase;
                arr[row][col] = value;
                value++;
            }

            n--;                        // 전진하는 양
            if (n==0) break;

            for (i = 0; i < n; i++){    // 행 index를 increase만큼 증가시킨다 increase가 -1이면 감소
                row += increase;
                arr[row][col] = value;
                value++;
            }
            increase *= -1;
        }

        return arr;
    }
}
