import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 7..
 *
 *  문자가 연속해서 나타나는 경우만을 말한다.
 *  for example {
 *      aabb : It is correct
 *      abba : It isn`t correct
 *      abab : It isn`t correct
 *  }
 *
 *  alphabet number is 26
 *  a ascii code is 97
 *  z ascii code is 122
 *
 *  그룹 단어인지 아닌지 검증하는 방법
 *  0. 0번째 배열은 건너뛰고 1번째 배열부터 비교를 시작한다
 *  1. 0번째 배열의 flag를 +1 한다
 *  1. flag[index] 배열의 값이 -1이면 그것은 전에 나온 적이 있는 것임으로 그룹 단어 체크가 될 수 없다
 *  2. flag[index] 배열의 값이 -1이 아니라면 그것은 전에 나온 적이 없는 것임으로 진행
 *  2. index -1 배열과 index 배열을 비교한다
 *  3. (같은 경우와 다른 경우를 생각해 볼 수 있다)
 *  4. 같은 경우, 같은 flag에 +1을 한다
 *  5. 다른 경우, flag[index-1] = -1 을 넣는다
 */
public class 그룹단어체커_1316_2 {
    Scanner scanner;
    String inputWord;
    int[] flags;

    public 그룹단어체커_1316_2() {
        scanner = new Scanner(System.in);
        flags = new int[26];
    }

    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord() {
        inputWord = scanner.nextLine();
    }

    /**
     * 그룹 단어 체커인지 아닌지 검사해준다
     * @variable
     * boolean check    : 그룹 단어가 맞을 경우에만 true를 반환한다
     * int[] flags      : 알파벳에 해당하는 플래그를 가르킨다
     * 만약 연속적인 경우에는 플래그 값을 증가시키고
     * 비연속적인 경우에는 플래그 값을 -1로 바꾼다
     *
     * char[] words     : String을 char 배열로 변환 후 저장
     * @param word : 그룹 단어 체커인지 아닌지 검사받고 싶은 단어
     * @return check : 단어가 그룹 단어 체커인지 아닌지 boolean 값을 리턴
     */
    public boolean checkGroupWord(String word) {
        boolean check = true;
        Arrays.fill(flags, 0);
        char[] words = word.toCharArray();

        for (int a = 0; a < words.length-1; a++){
            flags[words[a]-'a'] = -1; // It mean visited

            // 그룹 체커가 아닐 때만을 찾는다 !
            // 앞 뒤 단어가 다르고 뒤에 단어가 나온 적이 있는 단어라면 그룹 체커가 아니다
            if (words[a]!=words[a+1] && flags[words[a+1]-'a'] == -1){
                check = false;
                break;
            }
        }

        return check;
    }

    public static void main(String[] args) {
        그룹단어체커_1316_2 application = new 그룹단어체커_1316_2();

        Scanner scanner = new Scanner(System.in);
        int countOfGroupWord = 0;
        int testcaseNumber = 0;

        testcaseNumber = scanner.nextInt();

        for (int i = 0; i < testcaseNumber; i++){

            // Input a Word
            application.setInputWord();
            String word = application.getInputWord();

            // Is It GroupWordChecker ?
            if (application.checkGroupWord(word)){
                countOfGroupWord ++;
            }
        }

        System.out.println(countOfGroupWord);
    }
}
