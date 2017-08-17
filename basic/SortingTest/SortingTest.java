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

    ArrayList descendingArray;

    public SortingTest() {
        testArray = new ArrayList(Arrays.asList(80,75,10,60,15,49,12,25));
        answerArray = new ArrayList(Arrays.asList(10,12,15,25,49,60,75,80));

        descendingArray = new ArrayList(Arrays.asList(80, 75, 60, 49, 25,15,12,10));
    }

    @Test
    public void selectionSorting(){
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

    @Test
    public void bubleSotringDescending(){
        BubbleSorting application = new BubbleSorting();

        application.setArrayList(testArray);
        application.descendingSorting(application.getArrayList());

        assertEquals(descendingArray, application.sortingResult());
    }

    @Test
    public void mergeSorting(){
        MergeSorting application = new MergeSorting();

        application.setArrayList(testArray);
        application.sorting(application.getArrayList(), 0, application.getArrayList().size()-1);

        assertEquals(answerArray, application.sortingResult());
    }

    @Test
    public void radixSorting(){
        RadixSorting application = new RadixSorting();

        application.setArrayList(testArray);
        application.sorting(application.getArrayList());

        assertEquals(answerArray, application.sortingResult());
    }

    @Test
    public void shellSorting(){
        ShellSorting application = new ShellSorting();

        application.setArrayList(testArray);
        application.sorting(application.getArrayList());

        assertEquals(answerArray, application.sortingResult());
    }

    @Test
    public void insertSorting(){
        InsertSorting application = new InsertSorting();

        application.setArrayList(testArray);
        application.sorting(application.getArrayList());

        assertEquals(answerArray, application.sortingResult());
    }



}