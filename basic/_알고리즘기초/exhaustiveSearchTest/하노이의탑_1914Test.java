import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 14..
 */
public class 하노이의탑_1914Test {
    @Test
    public void test(){
        하노이의탑_1914 application = new 하노이의탑_1914();

        application.setInputNumber(3);

        assertEquals(7, application.findOutTopOfHanoi(application.getInputNumber()));
    }

    @Test
    public void testShowResult(){
        하노이의탑_1914 application = new 하노이의탑_1914();

        application.setInputNumber(3);
        assertEquals(7, application.Hanoi(application.getInputNumber(), 1,2,3));

    }

    @Test
    public void result(){
        하노이의탑_1914 application = new 하노이의탑_1914();

        application.setInputNumber(3);
        assertEquals(7, application.result(application.getInputNumber()));
    }

}