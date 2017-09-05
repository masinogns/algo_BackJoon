package 동적계획법1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 4..
 */
public class 붕어빵판매하기Test {
    붕어빵판매하기 application = new 붕어빵판매하기();

    @Test
    public void test1() throws Exception {
        assertEquals(10, application.solution(4, new int[]{1,5,6,7}));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(50, application.solution(5, new int[]{10,9,8,7,6}));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(55, application.solution(10, new int[]{1,1,2,3,5,8,13,21,35,55}));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(20, application.solution(4, new int[]{5,2,8,10}));
    }

    @Test
    public void test5() throws Exception {
        assertEquals(18, application.solution(4, new int[]{3,5,15,16}));
    }
}