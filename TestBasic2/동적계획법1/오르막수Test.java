package 동적계획법1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 5..
 */
public class 오르막수Test {
    오르막수 application = new 오르막수();

    @Test
    public void test1() throws Exception {
        assertEquals(10, application.solution(1));
        assertEquals(55, application.solution(2));
        assertEquals(220, application.solution(3));
    }
}