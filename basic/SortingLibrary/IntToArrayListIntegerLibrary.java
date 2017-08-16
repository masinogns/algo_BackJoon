import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by masinogns on 2017. 8. 16..
 */
public class IntToArrayListIntegerLibrary {
    public static void main(String[] args) {
        IntToArrayListIntegerLibrary application = new IntToArrayListIntegerLibrary();

        ArrayList<Integer> arrayList = application.getIntegerArrayList(1876);
        application.showArrayList(arrayList);
    }

    private ArrayList<Integer> getIntegerArrayList(int inputNumber) {
//        int inputNumber = 1820;
        int len;
        int a = 0, b = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        len = (int)(Math.log10(inputNumber)+1);

        // int형 변수를 각 자리 수에 맞게 ArrayList<Integer>에 담는다
        for (int i = 1; i <= len; i ++) {
            a = (int) (inputNumber / Math.pow(10, len - i));
            arrayList.add(a);
            b = (int) (inputNumber % Math.pow(10, len - i));
            inputNumber = b;
        }
        return arrayList;
    }

    private void showArrayList(ArrayList<Integer> arrayList) {
        System.out.println("======");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
