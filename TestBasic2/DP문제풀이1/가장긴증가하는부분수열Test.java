package DP문제풀이1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 6..
 */
public class 가장긴증가하는부분수열Test {
    가장긴증가하는부분수열 controller = new 가장긴증가하는부분수열();

    @Test
    public void test1() throws Exception {
        assertEquals(4, controller.solution(6, new int[]{10,20,10,30,20,50}));
    }
}