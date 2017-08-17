import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by masinogns on 2017. 8. 16..
 */
public class MergeSorting {

    private ArrayList arrayList;

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void sorting(ArrayList arrayList, int first, int last) {
        int mid = 0;

        if (first < last){                      // 나눌 것이 있다면
            mid = (first + last) / 2;           // 정렬할 배열을 절반으로 나누기 위해서 중간 위치를 찾는다
            sorting(arrayList, first, mid);     // mid보다 왼쪽에 있는 배열
            sorting(arrayList, mid+1, last);// mid보다 오른쪽에 있는 배열

            merge(arrayList, first, mid, last);
        }
    }

    private void merge(ArrayList<Integer> arrayList, int first, int mid, int last) {
        int left = first, right = mid+1;
        ArrayList<Integer> result = new ArrayList<>();

        int index = 0;
        while (left <= mid && right <= last){               // 왼쪽 배열과 오른쪽 배열 정렬하며 합치기
            if (arrayList.get(left) < arrayList.get(right)){
                result.add(index, arrayList.get(left));
                left++;
            }else {
                result.add(index, arrayList.get(right));
                right++;
            }
            index++;
        }

        // 남은거 있을 때 결과 배열에 몽땅 넣기
        while (left<=mid){
            result.add(index++, arrayList.get(left++));
        }

        while (right<=last){
            result.add(index++, arrayList.get(right++));
        }


        // 정렬된 순서로 array에 넣기, result array에 왼쪽 오른
        index = 0;
        for (int i = first; i <= last; i++){
            arrayList.set(i, result.get(index++));
        }

    }

    public ArrayList sortingResult() {
        return arrayList;
    }
}
