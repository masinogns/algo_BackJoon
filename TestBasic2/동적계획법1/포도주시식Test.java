package 동적계획법1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 5..
 */
public class 포도주시식Test {
    포도주시식 application = new 포도주시식();

    @Test
    public void test1() throws Exception {
        assertEquals(33, application.solution(6, new int[]{6,10,13,9,8,1}));

    }

}