import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by masinogns on 2017. 8. 16..
 *
 * 인접한 두 수를 비교해서 큰 수를 작은 수 뒤로 보내는 알고리즘
 *
 * 구현
 * 1. 이동 연산을 위한 for 문
 * 2. 비교 연산을 위한 for 문
 *
 * 총 2개의 for문으로 구현
 *
 * for example{
 *     for 1 가장 큰 수 정하기
 *       index[0] compare with index[1]
 *       index[1] compare with index[2]
 *       ...
 *       index[6] compare with index[7]
 *       .... 7번 째 수 정해짐
 *     for 2 그 다음 큰 수 정하기
 *       index[0] ...
 *       index[5] compare with index[6]
 *       ... 6번 째 수 정해짐 ..
 * }
 *
 */
public class BubbleSorting {
    private ArrayList arrayList;
    private ArrayList intToArrayListInteger;

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void sorting(ArrayList<Integer> arrayList) {
        int temp = 0;

        for (int i = 0; i < arrayList.size() -1; i++){          // 큰 수를 찾을 때마다 범위를 줄여간다
            for (int j = 0; j < arrayList.size() -1 -i; j++){   // 큰 수를 찾을 때까지 비교 연산 후 swap을 한다
                if (arrayList.get(j) > arrayList.get(j+1)){
                    // ArrayList  사용 시 swap 방법
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temp);
                }
            }
        }
    }

    public ArrayList sortingResult() {
        return arrayList;
    }

    // 1427 sort inside by acmpic.net
    public void descendingSorting(ArrayList<Integer> arrayList) {
        int temp = 0;

        for (int i = 0; i < arrayList.size()-1; i++){
            for (int j = 0; j < arrayList.size() -1 -i; j++){
                if (arrayList.get(j) < arrayList.get(j+1)){
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temp);
                }
            }
        }
    }

    public void resultSorting(){
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) System.out.print(iterator.next());
    }


    public static void main(String[] args) {
        BubbleSorting application = new BubbleSorting();

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        application.setIntToArrayListInteger(input);
        application.setArrayList(application.getIntToArrayListInteger());
        application.descendingSorting(application.getArrayList());
        application.resultSorting();
    }

    private ArrayList<Integer> setIntToArrayListInteger(int inputNumber) {
        intToArrayListInteger = new ArrayList();

        int len;
        int a = 0, b = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        len = (int)(Math.log10(inputNumber)+1);

        for (int i = 1; i <= len; i ++) {
            a = (int) (inputNumber / Math.pow(10, len - i));
            intToArrayListInteger.add(a);
            b = (int) (inputNumber % Math.pow(10, len - i));
            inputNumber = b;
        }
        return intToArrayListInteger;
    }


    public ArrayList<Integer> getIntToArrayListInteger() {
        return intToArrayListInteger;
    }
}
