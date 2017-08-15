import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 15..
 */
public class SortingTest {
    @Test
    public void selctionSorting(){
        SelectionSorting application = new SelectionSorting();

        ArrayList testArray = new ArrayList(Arrays.asList(80,75,10,60,15,49,12,25));
        ArrayList answerArray = new ArrayList(Arrays.asList(10,12,15,25,49,60,75,80));

        application.setArrayList(testArray);
        application.sorting(application.getArrayList());

        assertEquals(answerArray, application.sortingResult());
    }

    @Test
    public void quickSorting(){
        QuickSorting application = new QuickSorting();

        ArrayList testArray = new ArrayList(Arrays.asList(80,75,10,60,15,49,12,25));
        ArrayList answerArray = new ArrayList(Arrays.asList(10,12,15,25,49,60,75,80));

        application.setArrayList(testArray);
        application.sorting(application.getArrayList());

        assertEquals(answerArray, application.sortingResult());
    }
}