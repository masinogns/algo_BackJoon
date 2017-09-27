import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 20..
 */
public class 정렬 {

    @Test
    public void 통계학(){
        통계학_2108 application = new 통계학_2108();

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,3, 8,-2,2));

        application.setArray(arrayList);

        assertEquals(2, application.getMean(application.getArray()), 0.0);
        assertEquals(2, application.getMiddleNumber(application.getArray()));
        assertEquals(1, application.getFrequency(application.getArray()));
        assertEquals(10, application.getDifferenceBetweenMinAndMax(application.getArray()));
    }
}