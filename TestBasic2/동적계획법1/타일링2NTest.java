package 동적계획법1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 4..
 */
public class 타일링2NTest {
    타일링2N application;

    @Before
    public void setUp() throws Exception {
        application = new 타일링2N();
    }

    @Test
    public void test1() throws Exception {
        assertEquals(2, application.solution(2));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(55, application.solution(9));

    }
}