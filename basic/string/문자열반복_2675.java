import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 24..
 */
public class 문자열반복_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = 0;
        int[] testString;
        String[] strings;
        testNumber = scanner.nextInt();

        strings = new String[testNumber];
        testString = new int[testNumber];

        for (int i = 0; i < testNumber; i++){
            testString[i] = Integer.parseInt(scanner.next());
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < testNumber; i++){
            for (int j = 1; j < strings[i].length(); j++){
                for (int x = 0; x < testString[i]; x++){
                    System.out.print(strings[i].charAt(j));
                }
            }
            System.out.println("");
        }


    }
}
