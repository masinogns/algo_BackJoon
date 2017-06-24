import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 25..
 */
public class 카드게임_10801 {
    static class control{

        private int[] inputA;
        private int[] inputB;
        private Scanner scanner;
        public control() {
            inputA = new int[10];
            inputB = new int[10];
            scanner = new Scanner(System.in);
        }

        public void setInputA() {
            for (int i = 0; i < inputA.length; i++){
                inputA[i] = Integer.parseInt(scanner.next());
            }

        }

        public void setInputB() {
            for (int i = 0; i < inputB.length; i++){
                inputB[i] = Integer.parseInt(scanner.next());
            }
        }


        public int[] getInputA() {
            return inputA;
        }

        public int[] getInputB() {
            return inputB;
        }

        public void compareWithAandB(int[] inputA, int[] inputB) {
            int scoreA = 0;
            int scoreB = 0;
            int scoreD = 0;

            for (int i = 0; i < 10; i++){
                if (inputA[i] > inputB[i]){
                    scoreA += 1;
                }else if (inputA[i] < inputB[i]){
                    scoreB += 1;
                }else scoreD += 1;
            }

            if (scoreA != scoreB){
                if (scoreA > scoreB) System.out.println("A");
                else System.out.println("B");
            }else System.out.println("D");

        }
    }

    public static void main(String[] args) {
        control controller = new control();

        controller.setInputA();
        controller.setInputB();
        controller.compareWithAandB(controller.getInputA(), controller.getInputB());
    }
}
