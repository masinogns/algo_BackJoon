import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 10..
 */
public class 피보나치수5_10870 {
    private int inputNumber;

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public int findOutFibonachRecursive(int N) {
        if (N > 20) return -1;

        if (N == 0 || N == 1) return N;

        return findOutFibonachRecursive(N-1) + findOutFibonachRecursive(N-2);
    }

    public int findOutFibonachIterator(int inputNumber) {
        int ret = 0;

        if (inputNumber > 20) return -1;

        if (inputNumber == 0 || inputNumber == 1) return inputNumber;

        int now = 1, prev = 0;

        for (int i = 2; i <= inputNumber; i++){
            ret = now + prev;
            prev = now;
            now = ret;
        }
        return ret;
    }

    // 백준 알고리즘에 제출용
    public static void main(String[] args) {
        피보나치수5_10870 application = new 피보나치수5_10870();
        Scanner scanner = new Scanner(System.in);
        int fibo = scanner.nextInt();

        application.setInputNumber(fibo);
        System.out.println(application.findOutFibonachRecursive(application.getInputNumber()));

    }
}
