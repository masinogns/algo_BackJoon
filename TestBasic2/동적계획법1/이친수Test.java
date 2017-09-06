package 동적계획법1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 5..
 */
public class 이친수Test {
    이친수 application = new 이친수();

    @Test
    public void test1() throws Exception {
        assertEquals(2, application.solution(3));
        assertEquals(3, application.solution(4));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(2, application.solution2(3));
        assertEquals(3, application.solution2(4));
    }
}