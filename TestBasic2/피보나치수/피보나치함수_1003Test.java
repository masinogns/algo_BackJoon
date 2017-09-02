package 피보나치수;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 2..
 */
public class 피보나치함수_1003Test {
    피보나치함수_1003 application;

    @Before
    public void setUp() throws Exception {
        application = new 피보나치함수_1003();
    }

    @Test
    public void test() throws Exception {
        application.fibonacci(0);
        assertArrayEquals(new int[]{1,0} , application.getCount());
    }

    @Test
    public void test12() throws Exception {
        application.setCountOne(0);
        application.setCountZero(0);
        application.fibonacci(1);
        assertArrayEquals(new int[]{0,1}, application.getCount());
    }

    @Test
    public void test3() throws Exception {
        application.setCountOne(0);
        application.setCountZero(0);
        application.fibonacci(3);
        assertArrayEquals(new int[]{1,2}, application.getCount());

    }
}