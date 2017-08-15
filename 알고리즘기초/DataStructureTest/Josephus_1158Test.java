import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 15..
 */
public class Josephus_1158Test {
    @Test
    public void test(){
        Josephus_1158 application = new Josephus_1158();

        application.setPeopleNumber(7);
        application.setRemoveNumber(3);

        application.setJosephusArrays(application.getPeopleNumber());
        application.findOutJosephusArrays(application.getRemoveNumber());


        ArrayList<Integer> josephus = new ArrayList<>(
                Arrays.asList(3,6,2,7,5,1,4)
        );

        assertEquals(josephus, application.getJosephusArrays());
    }

}