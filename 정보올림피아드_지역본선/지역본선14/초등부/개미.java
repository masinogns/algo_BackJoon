package 지역본선14.초등부;

/**
 * Created by masinogns on 2017. 9. 26..
 */


/** 어려운 풀이... 아
 * 1. Map[Row][Colum]을 생성한다
 * 2. Ant[0] = new Ant(startX, startY)
 * 개미가 제일 처음 있는 위치로 0시일 때의 위치를 저장한다
 * 3. 이동은 op = 1 or -1로 제어한다.
 * 4. 개미가 이동을 하다가 경계면을 만나는 조건
 * if ( Row < p + 1 && Colum < q + 1 ) ; 오른쪽 위로 가는 개미
 * if ( p - 1 < 0 && q - 1 < 0 ) ; 왼쪽 아래로 가는 개미
 * 5. 경계면을 만난 직후의 개미가 위치하는 곳
 * op = 1, p + 1, q - 1
 * op = -1, p - 1, q + 1
 * 6. 만약 경계면을 만난 직후의 개미가 위치하는 곳이 범위 밖이라면 더 이상 갈 수 있는 곳이 없음
 * if ( Row < p + 1 && Colum < q - 1 )
 * if ( Row < p - 1 && Colum < q + 1 )
 *
 * 즉 경계면을 만나고 반대 방향으로 갈 수 있다면 반대로 이동할 수 있다
 */

/**
 * x축과 y축을 따로 생각하자
 * 그러면 t초는 x축으로 왔다갔다, y 축으로 왔다갔다 하는 개미 하나를 연상할 수 있다
 *
 * 이해를 요함..
 */
public class 개미 {
    public int[] solution(int Row, int Colum, int row, int col, int time) {

        int x, y;

        x = (col + time) / Colum;
        y = (row + time) / Row;

        if (x % 2 == 0)
            col = (col + time) % Colum;
        else
            col = Colum - ((col + time) % Colum);

        if (y % 2 == 0)
            row = (row+ time) % Row;
        else
            row = Row- ((row+ time) % Row);


        return new int[]{row, col};
    }
}
