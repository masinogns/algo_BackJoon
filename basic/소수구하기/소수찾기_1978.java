import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 25..
 */
public class 소수찾기_1978 {
    static class control{
        private Scanner scanner;
        private int testNumber;
        private int count;
        private int[] inputNumbers;

        public control() {
            scanner = new Scanner(System.in);
        }

        public void setTestNumber() {
            testNumber = scanner.nextInt();
        }

        public int getTestNumber() {
            return testNumber;
        }

        public void setInputNumber(int inputNumber) {
            inputNumbers = new int[inputNumber];

            for (int i = 0; i < inputNumber; i++){
                inputNumbers[i] = Integer.parseInt(scanner.next());
            }
        }

        public int[] getInputNumber() {
            return inputNumbers;
        }

        public int findPrimeNumber(int[] result) {
            count = 0;
            boolean isPrime;

            for (int i = 0; i < result.length; i++){
                isPrime = true;

                if (result[i] > 1){
                    for (int j = 2; j < result[i]; j++){
                        if (result[i]%j == 0){ // 소수가 아니다
                            isPrime = false;
                            break;  // 소수가 아니까 그만 판별해도 된다
                        }
                    }
                }else {
                    isPrime = false;
                }

                if (isPrime){
                    System.out.println(result[i]+"는 소수입니다");
                    count++;
                }
            }

            return count;
        }

    }

    public static void main(String[] args) {
        control controller = new control();

        controller.setTestNumber();
        controller.setInputNumber(controller.getTestNumber());
        int[] result = controller.getInputNumber();
        int count = controller.findPrimeNumber(result);
        System.out.println(count);
    }
}
