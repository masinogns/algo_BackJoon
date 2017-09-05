package 동적계획법1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 5..
 */
public class 쉬운계단수Test {
    쉬운계단수 application = new 쉬운계단수();

    @Test
    public void test1() throws Exception {
        assertEquals(17, application.solution(2));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(9, application.solution(1));
    }
}