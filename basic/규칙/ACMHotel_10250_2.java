import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 8..
 *
 * 이건 런타임 에러 없이 잘되는 이유가 무엇일까?
 */
public class ACMHotel_10250_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testcase = 0;
        int guestNumber = 0;
        int hotelFloor = 0;
        int rommNumber = 0;

        // 방 번호 Format은 YY(층)XX(번호)
        int XX = 0;
        int YY = 0;

        int result = 0;

        testcase = scanner.nextInt();

        while (testcase > 0){


            hotelFloor = scanner.nextInt();
            rommNumber = scanner.nextInt();
            guestNumber = scanner.nextInt();


            XX = (guestNumber-1)/hotelFloor +1;
            YY = (guestNumber-1)%hotelFloor +1;

            YY *= 100;

        result = YY+XX;

        System.out.println(result);

        testcase--;
        }

    }
}
