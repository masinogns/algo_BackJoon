import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 11..
 *
 * N이 주어졌을 때, 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램을 작성하시오.
 * 순열이란, 서로 다른 n개 중에서 r개를 택하여 일렬로 배열하는 경우를 말한
 * makePermutattion = 순
 * For example {
 *     1 ~ 3까지의 수로 이루어진 순열\
 *
 *      1 2 3
        1 3 2
        2 1 3
        2 3 1
        3 1 2
        3 2 1
 *
 * }
 *
 * 첫 자리가 n일 때의 순열 ( 길이 n ) --> 다음 자리가 n-1일 때의 조합 ( n-1 )
 *
 *
 // n : 전체 원소의 개수
 // picked : 지금까지 고른 원소의 개수
 // isPick : 이전에 선택된 원소인지 저장하고있는 변수
 // n개의 원소의 모든 순열을 구하는 방법


 출처: http://timpani.tistory.com/entry/java-모든-순열-만들기 [PS Coding]
 */
public class permutationInAlgoBook {
    public static int n;

    public static void main(String[] args) {
         permutationInAlgoBook application = new permutationInAlgoBook();

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(
                1, 2, 3
        ));

//        boolean isPick[] = new boolean[];
//        permutation(arrayList, isPick);

    }

    public static void permutation(ArrayList<Integer> picked, boolean isPick[] ){
        // 기저사례 : 모든 개수를 뽑아냈다.

        if( picked.size() == n ){
            System.out.println(picked);
            return ;
        }

        for(int next = 0; next < n; next++){
            if( isPick[next] )
                continue;

            picked.add(next);
            isPick[next] = true;

            permutation( new ArrayList<Integer>(picked), isPick );

            picked.remove(picked.size()-1);
            isPick[next] = false;
        }
//        출처: http://timpani.tistory.com/entry/java-모든-순열-만들기 [PS Coding]
    }



}
