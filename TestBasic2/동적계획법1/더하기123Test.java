package 동적계획법1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 4..
 */
public class 더하기123Test {
    더하기123 app = new 더하기123();

    @Before
    public void setUp() throws Exception {
        app = new 더하기123();
    }

    @Test
    public void test1() throws Exception {
        assertEquals(7, app.solution(4));
        assertEquals(1, app.solution(1));
        assertEquals(44, app.solution(7));
        assertEquals(274, app.solution(10));
    }
}