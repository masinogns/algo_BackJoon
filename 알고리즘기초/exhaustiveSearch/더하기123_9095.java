import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 11..
 *
 * 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램
 *
 * pattern(3) = pattern(3) + pattern(2) + pattern(1)
 *
 *
 */
public class 더하기123_9095 {
    private int inputNumber;
    private int counter;

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(){
        counter = 0;
    }

    public void findOutPattern(int N) {
        if (N == 0) {this.counter ++; return;}
        if (N < 0) {return;}

        findOutPattern(N-1);
        findOutPattern(N-2);
        findOutPattern(N-3);
    }

    public static void main(String[] args) {
        더하기123_9095 application = new 더하기123_9095();

        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();

        while (testcase > 0){
            int inputNumber = scanner.nextInt();
            application.setInputNumber(inputNumber);
            application.setCounter();
            application.findOutPattern(application.getInputNumber());
            System.out.println(application.getCounter());

            testcase--;
        }
    }
}
