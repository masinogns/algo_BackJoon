import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 10..
 */
public class 피보나치수5_10870Test {
    @Test
    public void test(){
        피보나치수5_10870 application = new 피보나치수5_10870();

        application.setInputNumber(10);

        assertEquals(55, application.findOutFibonachRecursive(application.getInputNumber()));
        assertEquals(55, application.findOutFibonachIterator(application.getInputNumber()));
    }

}