import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 23..
 */
public class 평균점수_10039 {
    static class control{

        private int sum;
        private int[] arr;

        public control() {
            sum = 0;
            arr = new int[5];
        }

        public int[] inputNumber() {
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < arr.length; i++){
                arr[i] = scanner.nextInt();
            }
            return arr;
        }

        public int[] numberCheck(int[] arr) {
            for (int i = 0; i<arr.length; i++){

                if (arr[i] < 40){
                    arr[i] = 40;
                }
            }
            return arr;
        }

        public int getSum(int[] checkedArr) {

            for (int i = 0 ; i< checkedArr.length; i++){
                sum = sum + checkedArr[i];
            }
            return sum;
        }

        public int getAverage(int sum, int divide) {
            int average = 0;
            average = sum / divide;
            return average;
        }
    }

    public static void main(String[] args) {
        control controller = new control();

        int[] arr = controller.inputNumber();
//        for (int a : arr) System.out.println(a);
        int[] checkedArr = controller.numberCheck(arr);
//        for (int a : checkedArr) System.out.println(a);
        int sum = controller.getSum(checkedArr);
        int average = controller.getAverage(sum, 5);
        System.out.println(average);
    }
}
