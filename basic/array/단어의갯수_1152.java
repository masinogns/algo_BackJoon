import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 23..
 */
public class 단어의갯수_1152 {
    static class control{

        private String command;
        private int spaceCount;

        public control() {
            command = null;
            spaceCount = 0;
        }

        public void setCommand(String command) {
            this.command = command;
        }

        public int spaceCheck() {
            for (int i = 0 ; i < command.length(); i++){
                if (command.charAt(i)==' ' && command.charAt(i+1)==' '){
                    spaceCount++;
                }
            }
            return spaceCount;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        control controller = new control();
        controller.setCommand(command);
        int result = controller.spaceCheck();
        System.out.println(result+1);

    }
}
