package 지역본선14.초등부;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 19..
 */


class Postion{
    int x, y;

    public Postion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getPostion(){
        return new int[]{x, y};
    }
}

public class 자리배정{
    private Postion[] postions;
    /**
     * @param C colum의 갯수로 '세로'를 뜻한다
     * @param R row의 갯수로 '가로'를 뜻한다
     * @param K 대기번호를 뜻하고 대기번호의 좌석 번호인 x,y를 구해야한다
     * @return
     */
    public int[] solution(int C, int R, int K) {
        postions = new Postion[C*R+1];
        postions[0] = new Postion(0,0);
        postions = makeConcertHall(C, R, postions);

        if (K > C*R) return new int[]{0};

//        x,y 출력문
//        for (int i = 1; i < C*R+1 ; i++){
//            System.out.println(postions[i].getX()+" "+postions[i].getY());
//        }

        return postions[K].getPostion();
    }

    private Postion[] makeConcertHall(int C, int R, Postion[] postions) {

        int value = 1, X = 1, Y = 0, row, colum;
        int op = 1;

        while (C>0&&R>0){

            for (row = 0; row < R; row++){
                Y += op;
                this.postions[value] = new Postion(X, Y);
                value++;
            }
            R--;
            if (R == 0 && C == 0)break;

            for (colum = 0; colum < C-1; colum++){
                X += op;
                this.postions[value] = new Postion(X, Y);
                value++;
            }
            op *= -1;

            C--;
            if (R == 0 && C == 0)break;

        }

        return postions;
    }

    public static void main(String[] args) {
        자리배정 application = new 자리배정();

        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        int R = scanner.nextInt();
        int K = scanner.nextInt();

        int[] ret = application.solution(C, R, K);
        if (ret.length == 2)
            System.out.println(ret[0]+" "+ret[1]);
        else System.out.println(0);
    }
}