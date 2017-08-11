import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 11..
 *
 * for example { 정수 4를 1,2,3의 조합으로 나타내는 방법은 총 7가지
 *   1+1+1+1
     1+1+2
     1+2+1
     2+1+1
     2+2
     1+3
     3+1
 * }
 *
 *
 * 리팩토링 하기 전의 원래 소스 --> 여러 개의 테스트를 돌리려하니 소스가 중복이 된다 리팩토링!
 application.setInputNumber(4);
 application.findOutPattern(application.getInputNumber());
 assertEquals(7,application.getCounter());

 출처 : https://github.com/Yukariko/acm/blob/master/problem/9095/test.c
 */
public class 더하기123_9095Test {
     @Test
     public void test(){

         더하기123_9095 application = new 더하기123_9095();

         assertPlus(application, 4, 7);
         assertPlus(application, 7, 44);
         assertPlus(application, 10,274);
     }

    private void assertPlus(더하기123_9095 application, int inputNumber, int expected) {
        application.setInputNumber(inputNumber);
        application.setCounter();
        application.findOutPattern(application.getInputNumber());
        assertEquals(expected, application.getCounter());
    }


}