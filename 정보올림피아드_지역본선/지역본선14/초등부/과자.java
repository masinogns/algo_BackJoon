package 지역본선14.초등부;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 19..
 */
public class 과자 {
    public int solution(int cookiePrice, int cookieNumber, int haveMoney) {

        int ret = 0;
        if (cookiePrice*cookieNumber > haveMoney )
            ret = cookiePrice*cookieNumber-haveMoney;
        else ret = 0;

        return ret;
    }

    public static void main(String[] args) {
        과자 application = new 과자();

        Scanner scanner = new Scanner(System.in);

        int ret = application.solution(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println(ret);
    }
}
