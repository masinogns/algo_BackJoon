import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 7..
 *
 * 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다.
 * (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)
 *
 * for example {
 *     room number = 9999
 *     set : 0 ~ 9
 *     첫번째 9 : use 9
 *     두번째 9 : use 6
 *     세번째 9 : set no more 6 or 9 and then get a one set, use 9
 *     네번째 9 : use 6
 * }
 *
 * 1. 방 번호를 입력받는다
 * 2. 숫자 세트 하나를 받는다 ( 숫자세트는 배열로 1로 초기화 되어있다 )
 * 3. 방 번호 첫 번째 자리를 숫자 세트에서 붙인다 ( 이 때, 배열 인덱스 값을 0로 바꾼다)
 * 4. 방 번호 두 번째 자리를 숫자 세트에서 붙인다
 * - if 9일 때 && 배열[9]==-1&&배열[6]!=0이라면 6을 사용하고 다음 방 번호로 이동한다.
 * - else if 6일 때 && 배열[6]==-1&&배열[9]!=0이라면 9를 사용하고 다음 방 번호로 이동한다.
 * - else 숫자가 사용됐다면 숫자 세트를 하나 더 추가하도록 한다 ( 각 배열 인덱스를 ++ 한다)
 */
public class 방번호_1475 {
    int inputRoomNumber;
    int[] flasticNumberSet;
    int[] dividedRoomNumber;
    int countOfFlasticNumberSet; // 플라스틱 숫자 세트 갯수

    public 방번호_1475() {
        flasticNumberSet = new int[10];
        Arrays.fill(flasticNumberSet, 0);
    }

    public int getInputRoomNumber() {
        return inputRoomNumber;
    }

    public void setInputRoomNumber() {
        Scanner scanner = new Scanner(System.in);
        inputRoomNumber = scanner.nextInt();
    }


    public int getCountOfFlasticNumberSet() {
        return countOfFlasticNumberSet;
    }

    public static void main(String[] args) {
        방번호_1475 application = new 방번호_1475();

        // Input Room Number
        application.setInputRoomNumber();
        int roomNumber = application.getInputRoomNumber();
//        System.out.println(roomNumber);

        // Room number를 자리 수 대로 쪼개기
        application.setDividedRoomNumberForPosition(roomNumber);
        int output = application.getCountOfFlasticNumberSet();

        System.out.println(output);
    }

    public void getFlasticNumberSet() {
        // 플라스틱 숫자 세트 추가하기
        for (int i = 0; i < flasticNumberSet.length; i++) {
            flasticNumberSet[i] += 1;
        }

        // 플라스틱 숫자 세트 갯수 세기
        countOfFlasticNumberSet++;


    }

    public void setDividedRoomNumberForPosition(int beforeDividedRoomNumber) {
        int countOfPosition = 1; // 자리 수 변수
        int value = beforeDividedRoomNumber;

        // 자리 수 구하는 로직
        while (beforeDividedRoomNumber >= 10) {
            beforeDividedRoomNumber /= 10;
            countOfPosition++;
        }
//        System.out.println(countOfPosition);    // 자리 수 출력

        // 각 자리의 값을 배열에 넣는 로직
        dividedRoomNumber = new int[countOfPosition];

        for (int i = 0; i < countOfPosition; i++) {
            dividedRoomNumber[countOfPosition - i - 1] = value % 10;
            value = value / 10;
        }

//        // 각 자리 값 출력
//        for (int i : dividedRoomNumber){
//            System.out.println(i);
//        }

        // 플라스틱 숫자 세트로 방 문 꾸미기
        for (int i : dividedRoomNumber) {
            if (i == 6 && flasticNumberSet[i] == 0 && flasticNumberSet[9] != 0) {
                flasticNumberSet[9] -= 1;
                continue;

            } else if (i == 9 && flasticNumberSet[i] == 0 && flasticNumberSet[6] != 0) {
                flasticNumberSet[6] -= 1;
                continue;
            }
            else if (flasticNumberSet[i] != 0) {
                flasticNumberSet[i] -= 1;
                continue;
            } else if (flasticNumberSet[i] == 0) {
                // 플라스틱 숫자 세트가 부족할 경우 플라스틱 세트 하나를 더 받아 온 다음 플라스틱 숫자를 제한다
                getFlasticNumberSet();
                flasticNumberSet[i] -= 1;
            }
        }
    }
}

