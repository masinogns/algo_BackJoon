import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 25..
 */
public class AplusB_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[2];
        int result = 0;

        for (int i = 0; i<input.length; i++){
            input[i] = Integer.parseInt(scanner.next());
        }

        for (int i = 0; i< input.length; i++){
            result += input[i];
        }

        System.out.println(result);
    }
}
