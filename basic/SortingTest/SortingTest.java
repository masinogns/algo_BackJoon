import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 15..
 */
public class SortingTest {

    ArrayList testArray;
    ArrayList answerArray;

    public SortingTest() {
        testArray = new ArrayList(Arrays.asList(80,75,10,60,15,49,12,25));
        answerArray = new ArrayList(Arrays.asList(10,12,15,25,49,60,75,80));
    }

    @Test
    public void selctionSorting(){
        SelectionSorting application = new SelectionSorting();

        application.setArrayList(testArray);
        application.sorting(application.getArrayList());

        assertEquals(answerArray, application.sortingResult());
    }

    @Test
    public void quickSorting(){
        QuickSorting application = new QuickSorting();

        application.setArrayList(testArray);
        application.sorting(application.getArrayList());

        assertEquals(answerArray, application.sortingResult());
    }

    @Test
    public void bubleSotring(){
        BubbleSorting application = new BubbleSorting();

        application.setArrayList(testArray);
        application.sorting(application.getArrayList());

        assertEquals(answerArray, application.sortingResult());
    }
}