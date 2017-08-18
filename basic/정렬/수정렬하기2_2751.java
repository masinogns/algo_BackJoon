import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 24..
 */

public class 수정렬하기2_2751 extends MergeSorting{
    public static void main(String[] args) {
        수정렬하기2_2751 application = new 수정렬하기2_2751();

        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList();

        while (testcase>0){

            arrayList.add(scanner.nextInt());

            testcase--;
        }
        application.setArrayList(arrayList);
        application.sorting(application.getArrayList(), 0, application.getArrayList().size() - 1);

        ArrayList<Integer> result = application.sortingResult();

        for (Integer integer : result) System.out.println(integer);


    }

}
