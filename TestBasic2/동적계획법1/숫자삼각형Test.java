package 동적계획법1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 2..
 */
public class 숫자삼각형Test {
    숫자삼각형 application;

    @Before
    public void setUp() throws Exception {
        application = new 숫자삼각형();
    }

    @Test
    public void test1() throws Exception {
        int[][] array = new int[][]{
                {7},
                {3,8},
                {8,1,0},
                {2,7,4,4},
                {4,5,2,6,5}
        };
        // array[5][5]
        assertEquals(30, application.solution(array, 5));

    }
}