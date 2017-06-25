import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 24..
 */
public class 별찍기1_2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputStar = 0;
        String star = "*";

        inputStar = scanner.nextInt();

        for (int i = 0; i < inputStar; i++){

            System.out.println(star);
            star += "*";
        }
    }
}
