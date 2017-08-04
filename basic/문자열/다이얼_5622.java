import java.util.List;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 4..
 */
public class 다이얼_5622 {

    int[] alphabet = {
            3,3,3, // 다이얼 2 일 때 걸리는 시간
            4,4,4, // 다이얼 x 일 때 걸리는 시간은 숫자 + 1 이다
            5,5,5,
            6,6,6,
            7,7,7,
            8,8,8,8,
            9,9,9,
            10,10,10,10
    };

    /**
     * Convert Character to Ascii
     * @param character
     * @return ascii
     */
    public int CharToAscii(char character){
        return (int)character;
    }

    /**
     * It must feed in alphabet array index
     * @param ascii
     * @return array index ( ascii - 5 )
     */
    public int AsciiToDial(int ascii){
        return ascii - 65;
    }

    /**
     *
     * @return
     */
    public String InputStringForDial(){
        String input = null;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        return input;
    }

    public static void main(String[] args) {
        다이얼_5622 controller = new 다이얼_5622();
        String input = controller.InputStringForDial();
        char[] charArray = input.toCharArray();
        int sum = 0;
        for (char character : charArray){
            int index = controller.AsciiToDial(controller.CharToAscii(character));
            sum += controller.alphabet[index];
        }

        System.out.println(sum);

    }
}
