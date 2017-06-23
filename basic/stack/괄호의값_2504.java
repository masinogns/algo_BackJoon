import java.util.Scanner;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 6. 21..
 */
public class 괄호의값_2504 {
    static class control{

        private String command;

        public void setCommand(String command) {
            this.command = command;
        }

        public boolean judgementVPS() {
            Stack<Character> bracket= new Stack<>();

            for (int i = 0; i < command.length(); i++){
                if (command.charAt(i)=='('){
                    bracket.push(command.charAt(i));
                }else if (command.charAt(i)=='['){
                    bracket.push(command.charAt(i));
                }else {
                    if (bracket.empty()){
                        return false;
                    }else {

                        bracket.pop();
                    }
                }
            }

            return bracket.empty();
        }

        public int valueOfVPS() {

            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        control controller = new control();
        controller.setCommand(command);
        if (controller.judgementVPS()) {
            System.out.println("YEs");
            int result = controller.valueOfVPS();
            System.out.println(result);
        } else {
            System.out.println("incorrect VPS!!");
        }
    }
}
