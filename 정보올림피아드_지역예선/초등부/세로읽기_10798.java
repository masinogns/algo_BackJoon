import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 24..
 */
public class 세로읽기_10798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] stringLength = new int[5];
        String[] inputString = new String[5];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i < inputString.length; i++){
            inputString[i] = scanner.nextLine();
        }

        for (int i = 0 ; i < stringLength.length; i++){
            stringLength[i]= inputString[i].length();
        }

        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 5; j++){
                if (i < stringLength[j]){
                    System.out.print(inputString[j].charAt(i));
                }else {
                    continue;
                }
            }
        }
    }
}
