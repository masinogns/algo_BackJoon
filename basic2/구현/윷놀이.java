package 구현;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 7..
 */
public class 윷놀이 {

    public char solution(int[] ints) {
        char[] chars = new char[5];

        chars[1] = 'A';
        chars[2] = 'B';
        chars[3] = 'C';
        chars[4] = 'D';
        chars[0] = 'E';

        int count = 0;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] == 0)
                count++;
        }

        return chars[count];
    }

    public static void main(String[] args) {
        윷놀이 controller = new 윷놀이();

        Scanner scanner = new Scanner(System.in);

        int number = 4, n = 3;
        int[] D = new int[number];

        while (n > 0){
            for (int i = 0; i < number; i++){
                D[i] = scanner.nextInt();
            }

            System.out.println(controller.solution(D));

            n--;
        }


    }
}
