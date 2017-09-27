package 지역본선13.초등부;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 27..
 */
public class 덩치Test {

    덩치 application = new 덩치();

    @Test
    public void test1() throws Exception {
        int peopleNumber = 5;

        int[][] hulking = new int[][]{
                {55,185},{58,183},{88,186},{60,175},{46,155}
        };

        ArrayList<Integer> ret = new ArrayList<>(Arrays.asList(2,2,1,2,5));
        assertEquals(ret, application.solution(peopleNumber, hulking));
    }
}