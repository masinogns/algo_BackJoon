import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 6..
 * 1 , 1
 * 7 = 1 + 6 , 2
 * 19 = 7 + 6 + 6 , 3
 * 37 = 19 + 6 + 6 + 6
 * 61 = 37 + 6 + 6 + 6 + 6
 * ....
 *
 * 1. 규칙이 적용된 배열 만들기
 * - 1번째 : 1
 * - 2번째 : 1번째 숫자에 (2-1)*6
 * - 3번째 : 2번째 숫자에 (3-1)*6
 * ...
 * - n번째 : n-1번째 숫자에 (n-1)*6 의 규칙으로 n의 배열 만들기
 * 2. 찾을 숫자 입력받기
 * 3. 배열에서 숫자 찾기
 * 4. 찾은 숫자 출력하기
 */

public class 벌집 {
    private int inputNumber;

    public static void main(String[] args) {
        벌집 application = new 벌집();

        application.setInputNumber();
        int getInputNumber = application.getInputNumber();
        int getPassHiveNumber = application.findPassHiveNumber(getInputNumber);
        System.out.println(getPassHiveNumber);
    }


    private int findPassHiveNumber(int getInputNumber) {
        int passHiveNumber = 1; // it is result
        int multipleNumber = 6;
        int roomNumber = 1;

        while (true){
            passHiveNumber = passHiveNumber + (roomNumber-1) * multipleNumber;

            if (getInputNumber <= passHiveNumber){
                break;
            }else{
                roomNumber++;
            }

        }

        return roomNumber;
    }

    private void setInputNumber() {
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
    }

    public int getInputNumber() {
        return inputNumber;
    }
}
