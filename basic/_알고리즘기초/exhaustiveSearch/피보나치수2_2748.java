/**
 * Created by masinogns on 2017. 8. 12..
 *
 * 10875 피보나치수 5와의 비교
 * 자료형의 차이
 * int를 사용할지 long을 사용할지...
 */
public class 피보나치수2_2748 {

    private int inputNumber;

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public long findOutFibonachIterator(int inputNumber) {
        long ret = 0;

//        if (inputNumber > 20) return -1;

        if (inputNumber == 0 || inputNumber == 1) return inputNumber;

        long now = 1, prev = 0;

        for (int i = 2; i <= inputNumber; i++){
            ret = now + prev;
            prev = now;
            now = ret;
        }
        return ret;
    }
}
