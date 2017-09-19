package 지역본선15.초등부;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 18..
 *
 * 자동차 10부제는 자동차 번호의 일의 자리 숫자와 날짜의 일의 자리 숫자가 일치하면 해당 자동차의 운행을 금지하는 것이다.
 *
 * 입력
 첫 줄에는 날짜의 일의 자리 숫자가 주어지고
 두 번째 줄에는 5대의 자동차 번호의 일의 자리 숫자가 주어진다.
 날짜와 자동차의 일의 자리 숫자는 모두 0에서 9까지의 정수 중 하나이다.

 *출력
 주어진 날짜와 자동차의 일의 자리 숫자를 보고 10부제를 위반하는 차량의 대수를 출력한다.
 */
public class 자동차10부제Test {

    자동차10부제 application = new 자동차10부제();

    @Test
    public void test1() throws Exception {

        int vanNumber = 1;
        int[] carNumbers = new int[]{1,2,3,4,5};

        assertEquals(1, application.solution(vanNumber, carNumbers));
    }

    @Test
    public void test2() throws Exception {

        int vanNumber = 3;
        int[] carNumbers = new int[]{1,2,3,5,3};

        assertEquals(2, application.solution(vanNumber, carNumbers));
    }

    @Test
    public void test3() throws Exception {

        int vanNumber = 5;
        int[] carNumbers = new int[]{1,3,0,7,4};

        assertEquals(0, application.solution(vanNumber, carNumbers));
    }
}