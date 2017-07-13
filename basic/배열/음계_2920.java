import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 23..
 */
public class 음계_2920 {
    static class control{
        public int[] inputNumber() {
            Scanner scanner = new Scanner(System.in);
            int[] inputNumber = new int[8];

            for (int i=0;i<inputNumber.length; i++){
                inputNumber[i] = Integer.parseInt(scanner.next());
            }
            return inputNumber;
        }

        public String numberChecked(int[] inputNumber) {
            String checked = null;
            String accending = "[1, 2, 3, 4, 5, 6, 7, 8]";
            String decending = "[8, 7, 6, 5, 4, 3, 2, 1]";
            String inputNumberToString = Arrays.toString(inputNumber);
//            System.out.println(inputNumberToString);

            if (inputNumberToString.equals(accending))checked="ascending";
            else if (inputNumberToString.equals(decending))checked="descending";
            else checked="mixed";

            return checked;
        }


    }

    public static void main(String[] args) {
        control controller = new control();

        int[] inputNumber = controller.inputNumber();
        String checked = controller.numberChecked(inputNumber);
        System.out.println(checked);
    }
}
