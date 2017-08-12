import org.junit.Test;

import static org.junit.Assert.*;

/** 못풀겠다 재귀
 * Created by masinogns on 2017. 8. 12..
 *
 * 출처] : http://deliorange.tistory.com/96
 */
public class Z_1074Test {
    @Test
    public void test(){
        Z_1074 application = new Z_1074();

        assertEquals(11, getOutput(application, 2, 3, 1));
        assertEquals(63, getOutput(application, 3, 7, 7));
        assertEquals(0, getOutput(application,1,0,0));
    }

    private int getOutput(Z_1074 application, int n, int row, int column) {
        int output2;
        application.setN(n);
        application.setRow(row);
        application.setColumn(column);
        application.findOutRowColumn(application.getN(), 0, 0);
        output2 = application.getRet();
        return output2;
    }

}