import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 23..
 */
public class 단어의갯수_1152 {
    /**
     * 목표. 단어의 갯수를 공백을 이용해서 찾아야 한다
     * 1. 스트링을 입력받는다
     * 2. 입력받은 스트링을 하나의 char형을 가져와서 비교한다
     * 3. 새로운 word스트링을 만든다
     * 4. 만약 하나의 char형이 문자일 경우에
     * 5. 만약 하나의 char형이 문자일 경우에 만약 word의 길이가 0일 경우에 카운트 하나 증가하고 word스트링에 넣는다
     * 6. 만약 하나의 char형이 공백이 경우에 word를 비운다
     */
    String word;
    String inputString;
    int theNumberOfWords;

    public 단어의갯수_1152() {
        word = "";
        inputString = null;
        theNumberOfWords = 0;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString() {
        Scanner scanner = new Scanner(System.in);
        this.inputString = scanner.nextLine();
    }

    public static void main(String[] args) {
        단어의갯수_1152 controller = new 단어의갯수_1152();

        controller.setInputString();
        System.out.println(controller.getInputString());
        int result = controller.countNumberOfWords(controller.getInputString());
        System.out.println(result);

    }

    private int countNumberOfWords(String inputString) {
        String space = " ";
        for (int i = 0; i < inputString.length(); i++){
            String compare = String.valueOf(inputString.charAt(i));
            if (compare.equals(space)){
                word = "";
            }else {
                if (word.length() == 0){
                    theNumberOfWords++;
                }
                word = compare;

            }
        }
        return theNumberOfWords;
    }
}
