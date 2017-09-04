package 동적계획법1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 3..
 */
public class 계단오르기Test {
    계단오르기 application;

    @Before
    public void setUp() throws Exception {
        application = new 계단오르기();
    }

    @Test
    public void test() throws Exception {
        int[] array = new int[]{10,20,15,25,10,20};
        assertEquals(75, application.solution(array, 6));
    }
}