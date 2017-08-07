import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 7..
 *
 * 아파트 거주 조건
 * for example {
 *     층 수  1호  2호  3호
 *     0층   1   2   3
 *     1층   1   3   6
 *     2층   1   4   10
 *
 *     N층 M호에 사는 사람 수는 N-1층 M호 + N층 M-1호에 사는 사람 수
 *     재귀적으로 풀어야 할 문제인 것 같다
 * }
 *
 * 1. 테스트 케이스를 입력받는다
 * 2. K층 N호에 대한 입력을 받는다
 * 3. K층 N호에 몇 명이 사는지 찾는다
 * - 찾는 방법
 * - if 호가 1일 때의 사람 수는 1이다
 * - else if 층이 0일 때의 사람 수는 '호'수 만큼이다
 * - else FloorAndHo[K][N]=[K-1][N]+[K][N-1]
 */
public class 부녀회장_2775 {
    Scanner scanner = new Scanner(System.in);
    int iTestcase;
    int iFloor;
    int iHo;

    public int getiTestcase() {
        return iTestcase;
    }

    public void setiTestcase() {
        iTestcase = scanner.nextInt();
    }

    public int getiFloor() {
        return iFloor;
    }

    public void setiFloor() {
        iFloor = scanner.nextInt();
    }

    public int getiHo() {
        return iHo;
    }

    public void setiHo() {
        iHo = scanner.nextInt();
    }

    public static void main(String[] args) {
        부녀회장_2775 application = new 부녀회장_2775();

        // Testcase Input
        application.setiTestcase();
        int testcase = application.getiTestcase();

        while (testcase != 0){

        // K Floor and N ho Input
        application.setiFloor();
        application.setiHo();

        // Find getPeopleNumber on the floor and ho
        int output = application.getPeopleNumber(application.getiFloor(), application.getiHo());
        System.out.println(output);

        testcase--;
        }
    }

    private int getPeopleNumber(int getiFloor, int getiHo) {
        if (getiFloor == 0){
            return getiHo;
        }else if (getiHo == 1){
            return 1;
        }

        return    getPeopleNumber(getiFloor-1, getiHo)
                + getPeopleNumber(getiFloor, getiHo-1);
    }
}
