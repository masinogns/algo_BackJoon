import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 27..
 */
public class 더하기싸이클_1110 {
    static class control{
        private int originNumber;
        int count = 1;

        public void setOriginNumber() {
            Scanner scanner = new Scanner(System.in);
            originNumber = scanner.nextInt();
        }


        public int getOriginNumber() {
            return originNumber;
        }

        public void cycleOperation(int originNumber) {
            int checkNumber = originNumber;
            int a , b, c = 0;

            while (true){

                a = originNumber / 10;
                b = originNumber % 10;
                c = a + b;

                originNumber = b*10 + c%10;

                if (checkNumber != originNumber) {
                    count++;
                    continue;
                }
                else break;
            }

        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        control controller = new control();

        controller.setOriginNumber();
        controller.cycleOperation(controller.getOriginNumber());
        System.out.println(controller.getCount());
    }
}
