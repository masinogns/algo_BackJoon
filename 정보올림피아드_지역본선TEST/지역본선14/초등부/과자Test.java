package 지역본선14.초등부;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 19..
 */
public class 과자Test {

    과자 application = new 과자();

    @Test
    public void test1() throws Exception {
        int cookiePrice = 300;
        int cookieNumber = 4;
        int haveMoney = 1000;

        assertEquals(200, application.solution(cookiePrice, cookieNumber, haveMoney));
    }

    @Test
    public void test12() throws Exception {
        int cookiePrice = 30;
        int cookieNumber = 4;
        int haveMoney = 100;

        assertEquals(20, application.solution(cookiePrice, cookieNumber, haveMoney));
    }

    @Test
    public void test13() throws Exception {
        int cookiePrice = 20;
        int cookieNumber = 6;
        int haveMoney = 120;

        assertEquals(0, application.solution(cookiePrice, cookieNumber, haveMoney));
    }

    @Test
    public void test15() throws Exception {
        int cookiePrice = 250;
        int cookieNumber = 2;
        int haveMoney = 140;

        assertEquals(360, application.solution(cookiePrice, cookieNumber, haveMoney));
    }
}