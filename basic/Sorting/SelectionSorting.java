import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 8. 15..
 *
 * Selection sort
 *
 * 장점
 *  - 데이터의 양이 적을 때 좋은 성능
 *  - 작은 값을 선택하기 위해서 비교는 여러 번 수행되지만 교환 횟수가 작다
 * 단점
 *  - 100개 이상의 자료에 대해서는 속도가 급격히 떨어져 적절히 사용되기 힘들다
 *
 */
public class SelectionSorting {
    private ArrayList<Integer> arrayList;

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    /**
     * Selection sort
     *
     * 1. 정렬되지 않은 자료 중에서 최솟값 구하기
     * 2. 위치 i번째 자료와 최솟값 자료의 위치를 교환
     *
     * @param Array
     */
    public void sorting(ArrayList<Integer> Array) {

        int count = Array.size();
        int temp = 0;
        int minmum = 0;


        for (int i = 0; i < count -1; i++){
            minmum = i;

            for (int j = i+1; j < count; j++){
                if (Array.get(j) < Array.get(minmum)){
                    minmum = j;
                }
            }

            /**
             * 이 부분이 swap 부분
             * temp = value[i]
             * value[i] = value[min]
             * value[min] = temp
             * ArrayList에서는 set() method로 구현
             */
            temp = Array.get(i);
            Array.set(i, Array.get(minmum));
            Array.set(minmum, temp);


//            temp = Array.get(i);
//            이거였을 때에는 왜 안되었을까???
//            Array.set(minmum, temp);
//            Array.set(i, Array.get(minmum));

            System.out.println((i+1)+"단계: "+Array.toString());
        }

    }


    public ArrayList sortingResult() {
        return arrayList;
    }
}
