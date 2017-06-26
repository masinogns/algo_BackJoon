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
        // http://mygumi.tistory.com/175


        public int valueOfVPS(int[] valueofCommand) {
            int result = 0;
            int value = 0;

            Stack<Integer> bracket1= new Stack<>();
            Stack<Integer> bracket2= new Stack<>();

            // 괄호의 짝이 맞는지 틀린지 확인
            for (int a: valueofCommand){
                result += a;
            }

            // 괄호의 짝이 맞았을 때 실행하는 로직
            if (result != 0){

                for (int i = 0; i < valueofCommand.length; i++){
                    if (valueofCommand[i] > 0) bracket1.push(valueofCommand[i]);
                    else bracket2.push(valueofCommand[i]);
                }

                for (int i = 0; i < valueofCommand.length; i++){
                    int front = 0;
                    int back = 0;

                    front = bracket1.pop();
                    back = bracket2.pop();

                    if (front == back*(-1)){
                        value += front;
                    }else if (front != back*(-1)){

                    }
                }

            }else value = 0;

            return value;
        }

        public String getCommand() {
            return command;
        }

        public int[] changeCommandToValue(String command) {
            int[] valueOfCommand = new int[command.length()];

            for (int i = 0; i < command.length(); i++){
                if (command.charAt(i)=='(') valueOfCommand[i] = 2;
                else if (command.charAt(i)=='[') valueOfCommand[i] = 3;
                else if (command.charAt(i)==')') valueOfCommand[i] = -2;
                else valueOfCommand[i] = -3;
            }
            return valueOfCommand;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        control controller = new control();
        controller.setCommand(command);
        int[] valueofCommand = controller.changeCommandToValue(controller.getCommand());

        int result = controller.valueOfVPS(valueofCommand);
        System.out.println(result);
    }
}
