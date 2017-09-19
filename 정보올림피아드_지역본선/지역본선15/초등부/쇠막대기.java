package 지역본선15.초등부;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class 쇠막대기 {
    public int solution(String string) {

        Stack<Integer> stack = new Stack<>();
        int theNumber = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == '('){
                stack.push(i);
            }else {
                if (stack.peek() + 1 == i){     // 레이저라면
                    stack.pop();
                    theNumber += stack.size();
                }else {                         // 레이저가 아니라면
                    stack.pop();
                    theNumber += 1;
                }
            }
        }

        return theNumber;
    }

    public static void main(String[] args) {
        쇠막대기 application = new 쇠막대기();

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int theNumber = application.solution(string);

        System.out.println(theNumber);
    }


}
