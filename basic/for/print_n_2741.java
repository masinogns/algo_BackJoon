import java.util.Scanner;

public class print_n_2741 {
    static class control{
        private int number;

        public control() {
            number = -1;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void printNumber1ToNumber() {
            if (number != -1){
                for (int i = 1; i <= number; i++){
                    System.out.println(i);
                }
            }else{
                // end
                System.out.println("No number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        control controller = new control();
        controller.setNumber(number);
        controller.printNumber1ToNumber();
    }
}
