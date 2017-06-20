import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 20..
 */
public class three_number_10817 {
    static class control{

        private int[] arr;

        public control() {
            arr = new int[3];
        }

        public void printSecondElement() {
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }

        public void setArr(int[] arr) {
            this.arr = arr;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(scanner.next());
        arr[1] = Integer.parseInt(scanner.next());
        arr[2] = Integer.parseInt(scanner.next());
        
        control controller = new control();
        controller.setArr(arr);
        controller.printSecondElement();
    }
}
