package 지역본선14.초등부;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 19..
 */
public class 자리배정Test {

    자리배정 application = new 자리배정();

    @Test
    public void test1() throws Exception {
        int column = 7;     // 가로
        int row = 6;        // 세로
        int K = 11;

        assertArrayEquals(new int[]{6,6}, application.solution(column, row, K));
    }
}