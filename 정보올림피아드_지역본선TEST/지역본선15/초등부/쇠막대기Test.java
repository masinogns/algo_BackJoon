package 지역본선15.초등부;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class 쇠막대기Test {
    쇠막대기 application = new 쇠막대기();

    @Test
    public void test1() throws Exception {
        String string = new String("()(((()())(())()))(())");

        assertEquals(17, application.solution(string));
    }

    @Test
    public void test2() throws Exception {
        String string = new String("(((()(()()))(())()))(()())");

        assertEquals(24, application.solution(string));
    }
}