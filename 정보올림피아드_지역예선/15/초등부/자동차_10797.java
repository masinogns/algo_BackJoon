import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 20..
 */
public class 자동차_10797 {
    static class control{
        private int carNumber;
        private int[] whetherNumbers;

        public control() {
            carNumber = -1;
            whetherNumbers = new int[3];
        }

        public int compareCarAndWheter() {
            int count = 0;

            for (int i =0; i<whetherNumbers.length; i++){
                if (carNumber==whetherNumbers[i]){
                    count++;
                }else {
                    continue;
                }
            }

            return count;
        }

        public void setWhetherNumbers(int[] whetherNumbers) {
            this.whetherNumbers = whetherNumbers;
        }

        public void setCarNumber(int carNumber) {
            this.carNumber = carNumber;
        }

        public void printElement(int i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int carNumber;
        int[] whetherNumbers = new int[5];

        Scanner scanner = new Scanner(System.in);
        carNumber = scanner.nextInt();
        for (int i=0; i<whetherNumbers.length; i++){
            whetherNumbers[i] = Integer.parseInt(scanner.next());
        }
        
        control controller = new control();
        controller.setCarNumber(carNumber);
        controller.setWhetherNumbers(whetherNumbers);
        controller.printElement(controller.compareCarAndWheter());
    }
}
