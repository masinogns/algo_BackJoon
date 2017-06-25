import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 25..
 */
public class AminusB_1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[2];
        int result = 0;

        for (int i = 0; i<input.length; i++){
            input[i] = Integer.parseInt(scanner.next());
        }

        for (int i = 0; i< input.length-1; i++){
            result = input[i] - input[i+1];
        }

        System.out.println(result);
    }
}
