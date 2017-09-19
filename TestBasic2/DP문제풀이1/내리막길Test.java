package DP문제풀이1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 7..
 */
public class 내리막길Test {
    내리막길 controller = new 내리막길();

    @Test
    public void test1() throws Exception {
        assertEquals(3, controller.solution(4,5,new int[][]{
                {50, 45, 37, 32, 30},
                {35, 50, 40, 20, 25},
                {30, 30, 25, 17, 28},
                {27, 24, 22, 15, 10}
        }));

    }
}