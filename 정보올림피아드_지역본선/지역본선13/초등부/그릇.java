package 지역본선13.초등부;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 27..
 *
 * 첫번째 그릇은 10의 높이를 가지고 있다
 * 같은 방향일 때는 +5이고
 * 다른 방향일 때는 +10이다
 */
public class 그릇 {
    public int solution(String string) {
        Stack<Character> stack = new Stack<>();
        int ret = 0;

        stack.push(string.charAt(0));
        ret += 10;

        for (int i = 1 ; i < string.length(); i++){
            if (stack.peek().equals(string.charAt(i))){
                stack.push(string.charAt(i));
                ret+=5;
            }else {
                stack.push(string.charAt(i));
                ret+=10;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        그릇 application = new 그릇();

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int ret = application.solution(string);

        System.out.println(ret);
    }
}
