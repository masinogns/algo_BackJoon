
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 25..
 */
public class 별찍기2_2439 {
    public static String repeat(String str, int times){
        StringBuilder ref = new StringBuilder();
        for (int i = 0; i < times; i++){
            ref.append(str);
        }
        return ref.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starNumber = 0;
        String star = "*";
        String space = " ";
        starNumber = scanner.nextInt();

        for (int i = 1; i <= starNumber; i++) {
            System.out.println(repeat(space, starNumber-i)+repeat(star, i));
        }
    }
}
