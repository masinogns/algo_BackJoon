import java.util.Scanner;

/** 계속 런타임 에러 발생하네....
 * Created by masinogns on 2017. 8. 7..
 *
 * 호텔 정문으로부터 걷는 거리가 가장 짧도록 방을 배정하는 프로그램
 * 층 H : 층 마다 방 수 W
 * 방 번호 : "층수" + "엘베에서부터 번호"
 *
 * for example {
 *     Guest    H : 층 수
 *     10   /   6       = 1 (+1)번째 방
 *     10   %   6       = 4 층의 $ 402호
 *     2    /   6       = 0 (+1)번째 방
 *     2    %   6       = 2 층의 $ 201호
 *
 *     exception !!!
 *     6층의 2번째 방
 *     12   /   6       = 2 (+1)번째 방
 *     12   %   6       = 0 층의 !!!!
 *
 *     10층의 2번째 방
 *     20   /   10      = 2 (+1)번째 방
 *     20   %   10      = 0 층의 !!!
 * }
 *
 * 0. 테스트 케이스를 입력받는다
 * 1. 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지 입력받는다
 * 2. 손님의 방을 배정한다
 * 3. 방을 출력한다
 *
 * 방을 배정하는 방법
 * if 손님의 순번을 층 수로 나누었을 때 나머지가 != 0{
 *     방 수에 +1만 하면 방 번호가 맞게 나온다
 * }
 * else if 손님의 순번을 층 수로 나누었을 때 나머지가 == 0{
 *     문제 발생 : 층 수에 관계없이 0층이 나온다
 *     0층을 나오는 것을 방지하기 위해서 손님 번수 -1 % 층 수 + 1을 하면 층 수를 온전히 갖을 수 있다
 * }
 *
 *
 */


/**
 * @variable
 *
 * guestNumber          : 몇 번째 손님인지
 * hotelFloor           : 호텔의 층수
 * roomNumberEachFloor  : 각 층의 방수
 *
 */
public class ACMHotel_10250 {
    int guestNumber;
    int hotelFloor;
    int roomNumberEachFloor;
    Scanner scanner;

    public ACMHotel_10250() {
        scanner = new Scanner(System.in);
    }

    public int getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber() {
        guestNumber = scanner.nextInt();
    }

    public int getHotelFloor() {
        return hotelFloor;
    }

    public void setHotelFloor() {
        hotelFloor = scanner.nextInt();
    }

    public int getRoomNumberEachFloor() {
        return roomNumberEachFloor;
    }

    public void setRoomNumberEachFloor() {
        roomNumberEachFloor = scanner.nextInt();
    }

    public static void main(String[] args) {
        ACMHotel_10250 application = new ACMHotel_10250();

        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();

        while (testcase > 0){
            application.setHotelFloor();
            application.setRoomNumberEachFloor();
            application.setGuestNumber();

            application.assignRoom(application.getHotelFloor(), application.getGuestNumber());



            testcase--;
        }
    }

    private void assignRoom(int hotelFloor, int guestNumber) {
        // 방 번호 Format은 YY(층)XX(번호)
        int XX = 0;
        int YY = 0;

        XX = (guestNumber-1)/hotelFloor +1;
        YY = (guestNumber-1)%hotelFloor +1;

        YY *= 100;

        int result = 0;
        result = YY+XX;

        System.out.println(result);
    }

}
