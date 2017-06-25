import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 20..
 */
public class example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        System.out.println(command);
        char[] chars = command.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[2]);
    }
}
