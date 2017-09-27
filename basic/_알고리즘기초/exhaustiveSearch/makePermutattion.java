/**
 * Created by masinogns on 2017. 8. 12..
 *
 * 출처 : http://gorakgarak.tistory.com/522
 */
public class makePermutattion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        permutation(arr, 0, 4, 4);
    }

    /**
     *
     * @param arr : 계속해서 데이터를 들고다니면서 교환되고 있는 배열
     * @param depth : 현재 트리구조에서 어떤 depth에서 교환작업을 하고 있는지에 대한 변수
     * @param N : 총 배열 안에 들어있는 숫자를 뜻하며 고정값이다
     *          ex) sample = 1,2,3,4이면 N은 4이다
     * @param k : 몇 개를 뽑아내서 순열을 만들 것 인지를 뜻하며 고정값이다
     *          ex) if k = 4, 1,2,3,4 모두 사용해서 순열을 만든다는 의미이다
     */
    private static void permutation(int[] arr, int depth, int N, int k) {
        if (depth==k){  // depth가 0부터 시작해서 k에 도달하면 모든 사이클을 돌았다는 의미이다
            print(arr, k);
            return;
        }

        for (int i = depth; i < N; i++){
            swap(arr, i, depth);
            permutation(arr, depth+1, N, k);
            swap(arr, i, depth);
        }
    }

    private static void swap(int[] arr, int i, int depth) {
        int temp = arr[i];
        arr[i] = arr[depth];
        arr[depth] = temp;
    }

    private static void print(int[] arr, int k) {
        for (int i = 0; i < k; i++){
            if (i==k-1){
                System.out.println(arr[i]);
            }else System.out.print(arr[i]+",");
        }
    }
}