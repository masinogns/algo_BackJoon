import java.util.List;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 26..
 */
public class x보다작은수_10871 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        int x = scanner.nextInt();
        int[] inputNumber = new int[number];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i< number; i++){
            inputNumber[i] = Integer.parseInt(scanner.next());
        }

        for (int i = 0; i<number; i++){
            if (inputNumber[i]<x){
                stringBuilder.append(inputNumber[i]+" ");
            }
        }

        System.out.println(stringBuilder.toString());


    }
}
