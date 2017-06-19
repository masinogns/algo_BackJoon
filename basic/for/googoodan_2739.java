import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 19..
 */
public class googoodan_2739 {
    static class control{
        private int number;

        public control() {
            number = -1;
        }

        public void printGoogoodan() {
            if (number >0 && number <10){
                for (int i = 1; i < 10; i++){
                    // why not workiing under line ?
//                    System.out.println("%d * %d = %d", number, i, number*i);
                    System.out.printf("%d * %d = %d \n", number, i, number*i);
                }

            }else {
                System.out.println("Your input number is incorrect form");
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
        controller.printGoogoodan();

    }
}
