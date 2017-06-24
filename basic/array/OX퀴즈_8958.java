import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 23..
 */
public class OX퀴즈_8958 {
    static class control{

        Scanner scanner = new Scanner(System.in);
        private int testNumber;
        private String[] inputOX;

        public void setTestNumber() {
            testNumber = scanner.nextInt();
        }

        public int getTestNumber() {
            return testNumber;
        }

        public void setInputOX(int testNumber) {
            inputOX = new String[testNumber];
            scanner.nextLine();// 개행문자 입력때문에 필요
            for (int i = 0 ; i < testNumber ; i++){
                inputOX[i] = scanner.nextLine();
            }
        }

        public String[] getInputOX() {
            return inputOX;
        }

        public void checkOX(String[] inputOX) {
            int sum, bonus;

            for (int i = 0 ; i < inputOX.length; i++){
                sum = 0;
                bonus = 1;

                for (int j = 0; j < inputOX[i].length(); j++){
                    if (inputOX[i].charAt(j)=='O'){
                        sum = sum + bonus;
                        bonus++;
                    }else {
                        bonus = 1;
                    }
                }
                System.out.println(sum);
            }

        }
    }

    public static void main(String[] args) {
        control controller = new control();

        controller.setTestNumber();
        controller.setInputOX(controller.getTestNumber());
//        for (String a : controller.getInputOX()) System.out.println(a);
//        System.out.println(controller.getInputOX().length);
        controller.checkOX(controller.getInputOX());
    }
}
