package 동적계획법1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 4..
 */
public class 타일링2N2Test {
    타일링2N2 application;

    @Before
    public void setUp() throws Exception {
        application = new 타일링2N2();
    }

    @Test
    public void test1() throws Exception {
        assertEquals(3, application.solution(2));
        assertEquals(2731, application.solution(12));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(171, application.solution(8));
    }
}