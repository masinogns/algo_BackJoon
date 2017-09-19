package 지역본선15.초등부;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class 자동차10부제 {
    public int solution(int vanNumber, int[] carNumbers) {

        int count = 0;

        for (int i = 0; i < carNumbers.length; i++){
            if (carNumbers[i] == vanNumber)
                count++;
        }

        return count;
    }
}
