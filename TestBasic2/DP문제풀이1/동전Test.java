package DP문제풀이1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 7..
 */
public class 동전Test {
    동전 controller = new 동전();

    @Test
    public void test1() throws Exception {
        assertEquals(10, controller.solution(3, 7, new int[]{1,2,5}));
    }
}