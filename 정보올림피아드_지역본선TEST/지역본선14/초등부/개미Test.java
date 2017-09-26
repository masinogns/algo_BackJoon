package 지역본선14.초등부;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 26..
 */
public class 개미Test {

    개미 application = new 개미();

    @Test
    public void test1() throws Exception {
        int Row = 6, Colum = 4;
        int startX = 4, startY = 1;
        int time = 8;

        assertArrayEquals(new int[]{0, 1}, application.solution(Row, Colum, startX, startY, time));
    }
}