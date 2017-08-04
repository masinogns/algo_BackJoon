import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 4..
 */
public class 상수_2908 {
    int input1;
    int input2;
    int organizeNumber1;
    int organizeNumber2;
    int[] reverseNumber1;
    int[] reverseNumber2;

    public static void main(String[] args) {
        상수_2908 controller = new 상수_2908();
        controller.setInputNumber();
        controller.reverseNumber1 =  controller.reverseNumber(controller.getInput1());
        controller.organizeNumber1 = controller.organizeNumber(controller.reverseNumber1);

        controller.reverseNumber2 =  controller.reverseNumber(controller.getInput2());
        controller.organizeNumber2 = controller.organizeNumber(controller.reverseNumber2);

        int compareNumber = controller.compareTwoNumbers(controller.getOrganizeNumber1(), controller.getOrganizeNumber2());
        System.out.println(compareNumber);

    }

    private int compareTwoNumbers(int organizeNumber1, int organizeNumber2) {
        int compare = 0;

        if (organizeNumber1 > organizeNumber2){
            compare = organizeNumber1;
        }else compare = organizeNumber2;

        return compare;
    }

    public int getOrganizeNumber1() {
        return organizeNumber1;
    }

    public int getOrganizeNumber2() {
        return organizeNumber2;
    }

    private int organizeNumber(int[] reverse) {
        int sum = 0;

        reverse[0] = reverse[0] * 1;
        reverse[1] = reverse[1] * 10;
        reverse[2] = reverse[2] * 100;

        sum = reverse[0] + reverse[1] + reverse[2];

        return sum;
    }

    private void setInputNumber() {
        Scanner scanner = new Scanner(System.in);
        input1 = scanner.nextInt();
        input2 = scanner.nextInt();
    }

    public int getInput1() {
        return input1;
    }

    public int getInput2() {
        return input2;
    }

    private int[] reverseNumber(int input) {
        int[] arrayInteger = new int[3];

        arrayInteger[0] = input / 100;
        arrayInteger[1] = (input / 10) % 10;
        arrayInteger[2] = input % 10;

        return arrayInteger;
    }


}
