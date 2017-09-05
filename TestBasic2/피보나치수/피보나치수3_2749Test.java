package 피보나치수;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 2..
 */
public class 피보나치수3_2749Test {
    피보나치수3_2749 application;

    @Before
    public void setUp() throws Exception {
        application = new 피보나치수3_2749();
    }

    @Test
    public void test1() throws Exception {
        assertEquals(55, application.solution(10));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(1597, application.solution(17));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(987, application.solution(16));
    }

    @Test
    public void test() throws Exception {
        assertEquals(228875, application.divideSolution(1000));
    }
}