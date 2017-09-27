package 지역본선14.초등부;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 26..
 */
public class 저울Test {

    저울 application = new 저울();

    @Test
    public void test1() throws Exception {
        int N = 6;
        int M = 5;
        int[][] A = new int[][]{
                {1,2},{2,3},{3,4},{5,4},{6,5}
        };

//        int[] ret = new int[]{2,2,2,0,3,3};
        ArrayList<Integer> ret = new ArrayList<>(Arrays.asList(2,2,2,0,3,3));

        assertEquals(ret, application.solution(N, M, A));
    }
}