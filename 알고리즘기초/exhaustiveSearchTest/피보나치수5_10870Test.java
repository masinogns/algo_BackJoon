import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 10..
 *
 * recursive와 iterator에 object 생성 부분이 똑같아서 get피보나치수로 뺐다
 *
 * 5 밀리초(ms) = 0.005 초(second)
 */
public class 피보나치수5_10870Test {
    @Test
    public void recursive(){
        피보나치수5_10870 application = get피보나치수5_10870();

        int recursive = application.findOutFibonachRecursive(application.getInputNumber());
        assertEquals(55, recursive);

    }

    @Test
    public void iterator(){
        피보나치수5_10870 application = get피보나치수5_10870();

        int iterator = application.findOutFibonachIterator(application.getInputNumber());
        assertEquals(55, iterator);
    }

    private 피보나치수5_10870 get피보나치수5_10870() {
        피보나치수5_10870 application = new 피보나치수5_10870();
        application.setInputNumber(10);
        return application;
    }

}