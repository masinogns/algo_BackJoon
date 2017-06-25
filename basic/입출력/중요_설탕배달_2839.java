import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 25..
 */
public class 중요_설탕배달_2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sugarKg = 0;
        int count = 0;

        sugarKg = scanner.nextInt();

        while (sugarKg > 0){
            if (sugarKg%5 != 0){
                sugarKg -= 3;
                count++;
            }else {
                count += sugarKg/5;
                break;
            }
        }

        if (sugarKg<0) System.out.println(-1);
        else System.out.println(count);
    }
}
