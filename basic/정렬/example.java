import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 21..
 */
public class example {
    // 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
    public static int getMean(ArrayList<Integer> array) {
        int sum = 0, size = 0;
        double mean = 0;

        size = array.size();

        for (Integer i : array){
            sum += i;
        }
        mean = (double) sum / size;
        return (int)Math.round(mean);
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(Arrays.asList(3,3,8));

        System.out.println(getMean(arrayList));
    }
}
