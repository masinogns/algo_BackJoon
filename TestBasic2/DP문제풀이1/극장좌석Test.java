package DP문제풀이1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 6..
 */
public class 극장좌석Test {
    극장좌석 controller = new 극장좌석();

    @Test
    public void test1() throws Exception {
        assertEquals(12, controller.solution(9, 2, new int[]{4,7}));
    }

    @Test
    public void fibo() throws Exception {
        assertEquals(5, controller.fibo(5));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(12, controller.solution(40, 0, new int[]{}));
    }
}