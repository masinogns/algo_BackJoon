package 구현;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 7..
 */
public class 윷놀이Test {
    윷놀이 controller = new 윷놀이();

    @Test
    public void test1() throws Exception {
        assertEquals('B', controller.solution(new int[]{0,1,0,1}));
        assertEquals('A', controller.solution(new int[]{1,1,1,0}));
        assertEquals('B', controller.solution(new int[]{0,0,1,1}));
    }
}