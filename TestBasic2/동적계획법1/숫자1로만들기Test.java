package 동적계획법1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 4..
 *
 */
public class 숫자1로만들기Test {

    숫자1로만들기 application;

    @Before
    public void setUp() throws Exception {
        application = new 숫자1로만들기();
    }

    @Test
    public void test(){
        assertEquals(1, application.solution(2));
    }

    @Test
    public void test2(){
        assertEquals(3, application.solution(10));
    }

    @Test
    public void test3(){
        assertEquals(1, application.solution2(2));
    }

    @Test
    public void test4(){
        assertEquals(3, application.solution2(10));
    }

    @Test
    public void test5(){
        assertEquals(1, application.solution3(2));
    }

    @Test
    public void test6(){
        assertEquals(3, application.solution3(10));
    }


}