package 지역본선14.초등부;

/**
 * Created by masinogns on 2017. 9. 26..
 *
 * 한국정보화진흥원에서 제공한 모범 소스..
 */
public class 저울 {
    public int[] solution(int N, int M, int[][] A) {

        // 가중치 그래프를 만들 배열
        int[][] array = new int[N+1][N+1];

        // array[큰 수][작은 수] = 1 값이 있음을 뜻한다
        for (int a = 0; a < A.length; a++){                     // front > end가 있는 경우들을
            array[A[a][0]][A[a][1]] = 1;                        // 1로 표시해준다
        }

        // 3중 for문 --> O(N^3)
        for (int middle = 1; middle <= N; middle++){            // middle을 고정시키고
            for (int front = 1; front <= N; front++){           // front를 변화시키면서 크기 비교
                if (array[front][middle]!=0){                   // 만약 array가 front > middle이 있는 경우
                    for (int end = 1; end <= N; end++){         // middle > end가 있는지 찾는다
                        if (array[middle][end]!=0)              // 만약 array가 middle > end가 존재한다면
                            array[front][end] = 1;              // array[middle][end]가 있다고 1로 표시해준다
                    }                                           // 즉 연관있는것들은 모두 1로 표시해서
                }                                               // 나중에 연관없는 것들을 카운트 해준다는 의도
            }
        }

        //
        for (int front = 1; front <= N; front++){
            int count = 0;

            for (int end = 1; end <= N; end++){
                // array[front][end] 도 0 이고 array[end][front] 도 0이라는 의미는
                // 무엇을 뜻할까? --> 연관없는 것들을 카운트한다는 의미
                // if문의 array[front][end] array[end][front]는 서로 연관있는 것을 물어보는 거고
                // == 0은 서로 연관이 없을 때 0이 된다는 것을 의미
                if (front != end && array[front][end] + array[end][front] == 0)
                    count++;
            }

            System.out.println(count);
        }

        return new int[0];
    }
}
