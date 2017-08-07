import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 7..
 * 분자 / 분모
 * 1. 원하는 X번째를 입력받는다
 * 2. X번째 숫자가 어디에 속해있는지 알기 위해서 1부터 N까지의 숫자를 빼면서 '어디에'를 찾는다
 * 이 때 1보다 작을 때를 찾는다
 * example ; input X is 14, output is 2/4
 * {
 *     14 - 1 = 13
 *     13 - 2 = 11
 *     11 - 3 = 8
 *     8 - 4 = 4
 *     4 - 5 = -1 , 이 말은 5번째 줄의 4번째 원소가 output임을 나타낸다
 *     if 5번 째의 맨 마지막 원소라고 하면 5 - 5 = 0 이기 때문에 1보다 작을 때가 나온다면 해당 N의 숫자의 배열을 만들면 된다
 * }
 * 3. 5번째 줄의 4번째 원소에 해당하는 output을 계산한다.
 * - 짝수일 경우, [ 1 / 줄의 번호를 분모 ]
 * {
 *     분자 +1, 분모 -1
 *     1/2 , 2/1
 *     1/4 , 2/3, 3/2, 4/1
 * }
 * - 홀수일 경우, [ 줄의 번호를 분자 / 1 ]
 * {
 *     분자 -1, 분모 +1
 *     3/1, 2/2, 1/3
 *     5/1, 4/2, 3/3, 2/4, 1/5
 * }
 * 4. output을 출력한다
 *
 */
public class 분수찾기_1193 {
    int inputNumber;
    int saveOfRow;
    int saveOfColumn;

    int outputUpper;
    int outputDown;

    public int getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber() {
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
    }

    public int getSaveOfRow() {
        return saveOfRow;
    }

    public int getSaveOfColumn() {
        return saveOfColumn;
    }

    public void setFindRowAndColumn(int getInputNumber) {
        int number = 0;
        int temp = 0;

        while (true){
            if (getInputNumber < 1){
                break;
            }else {
                number ++;
                temp = getInputNumber;
                getInputNumber -= number;
            }
        }

//        System.out.println(getInputNumber); // it is mean that find row and column
//        System.out.println("It is row : " + number); // row
//        System.out.println("It is column : " + temp);   // column

        this.saveOfRow = number;
        this.saveOfColumn = temp;
    }

    public void findOutput(int row, int column) {
        column = column -1;

        if (row % 2 == 0){  // 짝수일 때 [ 1 / row ]
            outputUpper = 1 + column;
            outputDown = row - column;

        }else {             // 홀수일 때 [ row / 1 ]
            outputUpper = row - column;
            outputDown = 1 + column;
        }

//        System.out.println(outputUpper+"/"+outputDown);
    }

    public static void main(String[] args) {
        분수찾기_1193 application = new 분수찾기_1193();

        application.setInputNumber();
        int getInputNumber = application.getInputNumber();

        application.setFindRowAndColumn(getInputNumber);
        int row = application.getSaveOfRow();
        int column = application.getSaveOfColumn();

        application.findOutput(row, column);

        System.out.println(application.outputUpper + "/" + application.outputDown);

    }

}
