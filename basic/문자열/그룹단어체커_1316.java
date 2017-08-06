import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 4..
 * 1. 단어의 갯수를 입력받는다
 * 2. 입력받은 단어의 갯수만큼의 단어를 입력받는다
 * 3. 입력받은 단어가 그룹단어인지 체크한다
 * 4. 그룹단어가 맞는다면 그룹단어 카운터에 +1을 아니라면 패스를 한다
 * 5. 그룹단어 카운터를 출력한다
 */
public class 그룹단어체커_1316 {
    int groupWordCounter;
    int inputWordNumbers;
    String[] inputWords;
    Scanner scanner;

    public 그룹단어체커_1316() {
         scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        그룹단어체커_1316 controller = new 그룹단어체커_1316();


        controller.setInputWordNumbers();
        controller.setInputWords(controller.getInputWordNumbers());
        String[] words = controller.getInputWords();
        int counter = controller.wordChecker(words);
        System.out.println(counter);

    }

    /**
     * 1. 문자열을 문자 배열로 바꾼다
     * 2.
     * @param words
     * @return
     */
    private int wordChecker(String[] words) {
        int counter = 0;

        boolean[] flags = new boolean[26];  // 기본 값으로 초기화
        Arrays.fill(flags, false);      // 특정 값으로 초기화

        for (int i =0 ; i < words.length; i++){
            System.out.println(words[i]);
            char[] charArr = words[i].toCharArray();

            for (int j = 0 ; j < charArr.length; j++){
                int index = 0;
                index = (int)charArr[j];
                index -= 97;

                if (flags[index] == false){
                    flags[index] = true;
                } else {
                    if (charArr[j]==charArr[j-1]){
                        continue;
                    }else break;
                }

                counter++;

            }
        }

        return counter;
    }

    public void setInputWordNumbers() {
        System.out.println("숫자를 입력하세요");
        this.inputWordNumbers = scanner.nextInt();
    }

    public void setInputWords(int getInputWordNumbers) {
        System.out.println(getInputWordNumbers);
        this.inputWords = new String[getInputWordNumbers];

        System.out.println("문자들을 입력하세요");

        /**
         * I wonder : nextLine을 하지 않으면 words[0]에 값이 들어가지 않는다 왜 그런것일까? !!
         *
         * That's because the Scanner.nextInt method does not consume the last newline character of your input,
         * and thus that newline is consumed in the next call to Scanner.nextLine.
         * int option = input.nextInt();
         * input.nextLine();  // Consume newline left-over
         * String str1 = input.nextLine();
         *
         * url : [stackoverflow] https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-nextint-or-other-nextfoo
         */
        scanner.nextLine();

        for (int i = 0; i < getInputWordNumbers; i++){
            this.inputWords[i] = scanner.nextLine();
        }
    }

    public int getGroupWordCounter() {
        return groupWordCounter;
    }

    public int getInputWordNumbers() {
        return inputWordNumbers;
    }

    public String[] getInputWords() {
        return inputWords;
    }
}
