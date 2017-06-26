import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 26..
 */
public class 합_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = 0;
        for (int i = 0; i<=input; i++){
            result += i;
        }

        System.out.println(result);
    }

}
