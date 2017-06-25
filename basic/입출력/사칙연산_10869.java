import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 25..
 */
public class 사칙연산_10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[2];
        int result = 0;

        for (int i = 0; i<input.length; i++){
            input[i] = Integer.parseInt(scanner.next());
        }


//        System.out.println(input[0]+input[1]);
//        System.out.println(input[0]-input[1]);
//        System.out.println(input[0]*input[1]);
        double resultFloat = (double)input[0]/input[1];
        System.out.println(resultFloat);
//        System.out.println(input[0]%input[1]);
    }

}
