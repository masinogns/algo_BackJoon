package 동적계획법1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 2..
 */
public class RGB거리Test {
    RGB거리 application;

    @Before
    public void setUp() throws Exception {
        application = new RGB거리();
    }

    @Test
    public void test() throws Exception {
        int[][] array = new int[][]{
                {26, 40, 83},
                {49, 60, 57},
                {13, 89, 99}
        };

        assertEquals(96, application.solution(array, 3));
    }


}