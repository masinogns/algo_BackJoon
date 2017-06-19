import java.util.Scanner;

public class print_n_2742 {
    static class control{

        private int number;

        public control() {
            number = -1;
        }

        public void printNumberNto1() {
            if (number > 0){
                // do this code
                for (int i = number; i > 0; i--){
                    System.out.println(i);
                }
            }else {
                // not work
                System.out.println("Not Number > 0 !! error");
            }
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        control controller = new control();
        controller.setNumber(number);
        controller.printNumberNto1();


    }
}
