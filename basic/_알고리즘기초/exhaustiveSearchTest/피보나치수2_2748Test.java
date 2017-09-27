import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 12..
 * N = 90 일 때
 * long 으로 했을 때의 결과 값 2880067194370816120
 * int 로 했을 때의 결과 값 -1581614984
 */
public class 피보나치수2_2748Test {
    @Test
    public void test(){
        피보나치수2_2748 application = new 피보나치수2_2748();

        application.setInputNumber(90);
        long iterator = application.findOutFibonachIterator(application.getInputNumber());

        assertEquals(0, iterator);

    }

}