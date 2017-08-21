import java.util.*;

/**
 * Created by masinogns on 2017. 8. 20..
 */
public class 통계학_2108 {
    private ArrayList<Integer> array;

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }

    public ArrayList<Integer> getArray() {
        return array;
    }

    // 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
    public int getMean(ArrayList<Integer> array) {
        int sum = 0, size = 0;
        double mean = 0;

        size = array.size();

        for (Integer i : array){
            sum += i;
        }
        mean = (double) sum / size;

        return (int) Math.round(mean);
    }

    public int getMiddleNumber(ArrayList<Integer> array) {
        int middle = 0;

        middle = array.size() / 2;

        Collections.sort(array);

        return array.get(middle);
    }

    // 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
    public int getFrequency(ArrayList<Integer> array) {
        // 숫자 , 카운트
        HashMap<Integer, Integer> check = new HashMap<>();

        for (Integer i : array){
            Integer key = i;
            Integer count = check.get(key);

            if (count == null){
                check.put(key, 1);
            }else {
                check.put(key, count+1);
            }
        }

        return sortHashMapValues(check);
    }

    private int sortHashMapValues(HashMap<Integer, Integer> check) {
        int ret = -1;
        ArrayList<Integer> arrayList = new ArrayList<>();

        // value 기준으로 정렬하기
        Integer tempKey = -999, tempValue = -999;
        for (Integer integer: check.keySet()){
            Integer key = integer;
            Integer value = check.get(integer);

            if (tempValue < value){
                tempKey = key;
                tempValue = value;
            }
        }

        // value랑 같은 거 리스트에 넣기
        for (Integer integer: check.keySet()){
            Integer key = integer;
            Integer value = check.get(integer);

            if (tempValue == value){
                arrayList.add(key);
            }
        }

        // if 하나밖에 없으면 하나 출력, 리스트에서 두번째값 출력
        if (arrayList.size() == 1){
            ret = arrayList.get(0).intValue();
        }else {
            ret = arrayList.get(1).intValue();
        }

        return ret;
    }

    public int getDifferenceBetweenMinAndMax(ArrayList<Integer> array) {
        int size = 0, range = 0;
        Collections.sort(array);
        size = array.size();

        range = array.get(size-1) - array.get(0);

        return range;
    }

    public static void main(String[] args) {
        통계학_2108 application = new 통계학_2108();

        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        ArrayList arrayList = new ArrayList();

        while (testcase > 0){
            arrayList.add(scanner.nextInt());
            testcase--;
        }

        application.setArray(arrayList);
        System.out.println(application.getMean(application.getArray()));
        System.out.println(application.getMiddleNumber(application.getArray()));
        System.out.println(application.getFrequency(application.getArray()));
        System.out.println(application.getDifferenceBetweenMinAndMax(application.getArray()));
    }
}
