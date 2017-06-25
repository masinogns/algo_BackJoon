import java.util.Scanner;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 6. 20..
 *
 * 1. 반복문 횟수 설정
 * 2. 반복문 동안에 한 라인의 올바른 괄호 문자열인 VPS를 입력받는다
 * 3. VPS가 맞는지 판단한다 yes or not
 * 4. 1 번으로 돌아간다
 */
public class 중요_괄호_9012 {
    static class control{
        Scanner scanner = new Scanner(System.in);
        String command = null;
//        char[] chars = null;


        public boolean judgementVPS() {
            Stack<Character> stack = new Stack<Character>();
            command = scanner.nextLine();
//            chars = command.toCharArray();

            for (int i=0; i<command.length(); i++) {
                if (command.charAt(i) == '(') {
                    stack.push(command.charAt(i));
                } else {
                   if (stack.empty()){
                        return false;
                   }else {
                       stack.pop();
                   }
                }
            }
            return stack.empty();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = scanner.nextInt();

        control controller = new control();

        for (int i = 0; i<loop; i++){
            if (controller.judgementVPS()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
