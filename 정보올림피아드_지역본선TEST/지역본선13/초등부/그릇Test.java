package 지역본선13.초등부;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 27..
 */
public class 그릇Test {

    그릇 application = new 그릇();

    @Test
    public void test1() throws Exception {
        String string = new String("((((");

        assertEquals(25, application.solution(string));
    }
}