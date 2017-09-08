package DP문제풀이1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 7..
 */
public class 초콜릿자르기Test {

    초콜릿자르기 controller = new 초콜릿자르기();

    @Test
    public void test1() throws Exception {
        assertEquals(3, controller.solution(2,2));

    }
}