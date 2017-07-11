import java.util.Scanner;

/**
 * Created by masinogns on 2017. 7. 10..
 */
public class 한수_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int count = 0;
        int hundred, ten, one = 0;
        int[] result = new int[2];

        for (int i = 1; i <= input; i++){

            if (i < 100){
                count += 1;
            }else {
                hundred = i / 100;
                ten = (i/10) % 10;
                one = i % 10;

                result[0] = hundred - ten;
                result[1] = ten - one;

                if (result[0]==result[1]){
                    count+=1;
                }else continue;


            }
        }

        System.out.println(count);
    }
}
