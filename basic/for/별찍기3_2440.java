import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 25..
 */
public class 별찍기3_2440 {
    public static String repeat(String str, int times){
        StringBuilder ref = new StringBuilder();

        if (times != 0){
            for (int i = 0; i < times; i++){
                ref.append(str);
            }
        }else return null;
        return ref.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starNumber = 0;
        String star = "*";
        starNumber = scanner.nextInt();

        for (int i = 0; i < starNumber; i++){
            System.out.println(repeat(star, starNumber-i));
        }

    }
}


