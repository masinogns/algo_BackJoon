package 지역본선15.초등부;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class 세로읽기Test {

    세로읽기 application = new 세로읽기();

    @Test
    public void test1() throws Exception {
        String[] strings = new String[]{
                "ABCDE",
                "abcde",
                "01234",
                "FGHIJ",
                "fghij"
        };

        String result = "Aa0FfBb1GgCc2HhDd3IiEe4Jj";

        assertEquals(result, application.solution(strings));
    }

    @Test
    public void test2() throws Exception {
        String[] strings = new String[]{
                "AABCDD",
                "afzz",
                "09121",
                "a8EWg6",
                "P5h3kx"
        };

        String result = "Aa0aPAf985Bz1EhCz2W3D1gkD6x";

        assertEquals(result, application.solution(strings));
    }

}