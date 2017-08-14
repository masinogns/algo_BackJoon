import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by masinogns on 2017. 8. 14..
 *
 */
public class 하노이의탑_1914 {
    private int inputNumber;
    private int ret = 0;

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    /**
     * findOut(N) n개의 원반을 옮기는데 드는 횟수를 반환하는 함수
     * 원판 n-1개를 다른 곳으로 옮기는 횟수 : f(N-1)
     *
     * 원판 n-1개를 2번째 기둥으로 옮기는 횟수 : f(N-1)
     * 가장 아래에 있는 원판을 C 기둥으로 옮기는 횟수 : 1
     * 원판 n-1개를 3번째 기둥으로 옮기는 횟수 : f(N-1)
     *
     * f(N) : {
     *  if n = 1, 1
     *  if n >= 1, 2f(N-1)+1
     * }
     * @param N : 옮겨야 할 원반의 갯수
     * @return ret : n개의 원반을 옮기는데 드는 횟수
     */
    public int findOutTopOfHanoi(int N) {

        if (N==1){
            return 1;
        }

        return 2*findOutTopOfHanoi(N-1)+1;
    }

    /**
     - 기둥1에서 n-1개의 원판을 기둥3을 이용하여 기둥2로 옮긴다. -> Hanoi(n-1,from,to,by);
     - 기둥1에서 남은 1개의 원판을 기둥3으로 옮긴다. -> Move(from,to,n);
     - 기둥2에서 n-1개의 원판을 기둥1을 이용하여 기둥3으로 옮긴다. -> Hanoi(n-1,by,from,to);

     출처: http://milkye.tistory.com/132 [MilkyeWay]
     * @param N : 원판의 갯수
     * @param from : 기준 기둥
     * @param by : 옮길 때 이용하는 기둥
     * @param to : 목적지 기둥
     * @return
     *
     * for example      3,      1,      2,      3
     */
    public int Hanoi(int N, int from, int by, int to) {
        if (N==1){
            ret++;
            Move(from, to, N);
        }else {
            Hanoi(N-1, from, to, by);
            Move(from, to, N);
            ret++;
            Hanoi(N-1, by, from, to);
        }
        return ret;
    }

    private void Move(int from, int to, int n) {
//        String first = "옮겨진 원판은 " + n +"이며, ";
        String second = from+" "+to;
        String result = second;

        System.out.println(result);
    }

    public int result(int inputNumber) {
        하노이의탑_1914 application = new 하노이의탑_1914();

        application.setInputNumber(inputNumber);

        if (application.getInputNumber() < 20){
            return Hanoi(application.getInputNumber(), 1,2,3);
        }else {
            return application.findOutTopOfHanoi(application.getInputNumber());
        }
    }

    public static void main(String[] args) {

        하노이의탑_1914 application = new 하노이의탑_1914();
        Scanner scanner = new Scanner(System.in);
        int inputnumber = scanner.nextInt();

        System.out.println(application.result(inputnumber));

    }
}
