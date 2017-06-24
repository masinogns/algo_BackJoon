import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 24..
 */
public class 수정렬하기1_2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int[] result;

        inputNumber = scanner.nextInt();

        result = new int[inputNumber];

        for (int i = 0; i < inputNumber; i++){
            result[i] = scanner.nextInt();
        }

        Arrays.sort(result);

        for (int i : result) System.out.println(i);
    }
}
