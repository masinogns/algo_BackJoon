import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 20..
 */
public class 스택_10828 {
    static class control{
        Scanner scanner = new Scanner(System.in);
        private List stack = new ArrayList();
        private int number;

        public control() {

        }

        public void run() {
            String command = null;
            int pushNumber = 0;

            for (int i = 0; i < number ; i++){
                command = scanner.next();

                if (command=="push"){
                    pushNumber = Integer.parseInt(scanner.next());
                    stack.add(pushNumber);
                }else if (command=="pop"){
                    System.out.println(stack.get(stack.size()-1));
                    stack.remove(stack.size()-1);
                }else if (command=="size"){
                    System.out.println(stack.size());
                }else if (command=="empty"){
                    System.out.println(stack.isEmpty());
                }else if (command=="top"){
                    if (stack.isEmpty()){
                        System.out.println("-1");
                    }else {
                        System.out.println(stack.size()-1);
                    }
                }

            }
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        control controller = new control();
        controller.setNumber(number);
        controller.run();
    }
}
