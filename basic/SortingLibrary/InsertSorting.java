import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 8. 17..
 *
 * Insert Sort
 * 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여
 * 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘
 *
 * [ 정렬된 데이터를 비교해서 올바른 위치에 삽입하는 'Insert Sort' ]
 *
 */
public class InsertSorting {
    private ArrayList<Integer> arrayList;

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void sorting(ArrayList<Integer> arrayList) {
        int temp = 0, compareValue = 0;

        for (int i = 1; i < arrayList.size(); i++){
            for (int index = 0; index < i; index++){
                if (arrayList.get(i) < arrayList.get(index)){
                    temp = arrayList.get(index);
                    arrayList.set(index, arrayList.get(i));
                    arrayList.set(i, temp);
                }

            }
        }
    }

    public ArrayList sortingResult() {
        return arrayList;
    }
}
