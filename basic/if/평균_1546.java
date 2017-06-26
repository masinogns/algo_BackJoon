import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 26..
 */
public class 평균_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfScore = scanner.nextInt();
        double[] scores = new double[numberOfScore];
        double result = 0;
        int M = 0;

        // 입력받고
        for (int i = 0; i< numberOfScore; i++){
            scores[i] = Integer.parseInt(scanner.next());
        }

        // 가장 큰 수 M
        for (int i = 0; i< numberOfScore; i++){
            if (M < scores[i]){
                M = (int) scores[i];
            }
        }

        for (int i = 0; i< numberOfScore; i++){
            result += (scores[i]/M)*100.0;

        }
        result = result/numberOfScore;
        String rr = String.format("%.2f", result);
        System.out.print(rr);
    }
}
