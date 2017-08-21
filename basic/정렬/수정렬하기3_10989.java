import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 24..
 */

public class 수정렬하기3_10989 extends RadixSorting{
    public static void main(String[] args) {
        RadixSorting application = new RadixSorting();

        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList();

        while (testcase>0){

            arrayList.add(scanner.nextInt());

            testcase--;
        }
        application.setArrayList(arrayList);
        application.sorting(application.getArrayList());

        ArrayList<Integer> result = application.sortingResult();

        for (Integer integer : result) System.out.println(integer);


    }
}
