import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 24..
 */
public class 아스키코드_11654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character;
        int characterToAscii;

        character = scanner.next().charAt(0);

        characterToAscii = (int)character;
        System.out.println(characterToAscii);
    }
}
