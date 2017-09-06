package 동적계획법1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 6..
 */
public class 이동하기Test {
    이동하기 application = new 이동하기();

    @Test
    public void test1() throws Exception {
        assertEquals(31, application.solution(3,4, new int[][]{
                {1,2,3,4},
                {0,0,0,5},
                {9,8,7,6}
        }));

    }

    @Test
    public void test2() throws Exception {
        assertEquals(3, application.solution(3,3, new int[][]{
                {1,0,0},
                {0,1,0},
                {0,0,1}
        }));

    }

    @Test
    public void test3() throws Exception {
        assertEquals(47, application.solution(4,3, new int[][]{
                {1,2,3},
                {6,5,4},
                {7,8,9},
                {12,11,10}
        }));

    }
}