import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 26..
 */
public class 이천칠년_1924 {
    static class control{

        int[] monthAndDay = new int[2];
        int[] month = new int[13];
        int[] day = new int[13];
        int result = 0;

        public control() {
            month = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            day = new int[]{0, 31,28,31,30,31,30,31,31,30,31,30,31};
        }

        public void setMonthAndDay() {
            Scanner scanner = new Scanner(System.in);

            monthAndDay[0] = Integer.parseInt(scanner.next());
            monthAndDay[1] = scanner.nextInt();
        }

        public int[] getMonthAndDay() {
            return monthAndDay;
        }

        public void findWeekDay(int[] monthAndDay) {

            for (int i = 1 ; i < monthAndDay[0]; i++){
                result += day[i];
            }
            result += monthAndDay[1];

            switch (result%7){
                case 0 :
                    System.out.println("SUN");
                    break;
                case 1 :
                    System.out.println("MON");
                    break;
                case 2 :
                    System.out.println("TUE");
                    break;
                case 3 :
                    System.out.println("WED");
                    break;
                case 4 :
                    System.out.println("THU");
                    break;
                case 5 :
                    System.out.println("FRI");
                    break;
                case 6 :
                    System.out.println("SAT");
                    break;
            }

        }
    }

    public static void main(String[] args) {
        control controller = new control();

        controller.setMonthAndDay();
        controller.findWeekDay(controller.getMonthAndDay());

    }
}
