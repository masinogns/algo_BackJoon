package DP문제풀이1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 6..
 */
public class 동물원Test {
    동물원 controller = new 동물원();

    @Test
    public void name() throws Exception {
        assertEquals(41, controller.solution(4));
    }
}