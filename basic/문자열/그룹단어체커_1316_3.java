import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 8..
 */
public class 그룹단어체커_1316_3 {
    public static void main(String[] args) {
        그룹단어체커_1316_3 application = new 그룹단어체커_1316_3();
        application.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int count = 0;
        scanner.nextLine();

        while (testcase > 0){
            String word = scanner.nextLine();
            boolean check = true;
            int[] flags = new int[26];
            Arrays.fill(flags, 0);

            char[] words = word.toCharArray();

            for (int a = 0; a < words.length-1; a++){
                flags[words[a]-'a'] = -1; // It mean visited

                // 그룹 체커가 아닐 때만을 찾는다 !
                // 앞 뒤 단어가 다르고 뒤에 단어가 나온 적이 있는 단어라면 그룹 체커가 아니다
                if (words[a]!=words[a+1] && flags[words[a+1]-'a'] == -1){
                    check = false;
//                    System.out.println("fail");
                    break;
                }

            }

            if (check) count++;

            testcase--;
        }

        System.out.println(count);
    }
}
