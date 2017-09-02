package 피보나치수;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 2..
 */
public class 피보나치함수_1003 {
    private int countZero = 0;
    private int countOne = 0;

    public int fibonacci(int n) {
        if (n==0){
            countZero++;
            return 0;
        }else if (n==1){
            countOne++;
            return 1;
        }else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public void setCountZero(int countZero) {
        this.countZero = countZero;
    }

    public void setCountOne(int countOne) {
        this.countOne = countOne;
    }

    public int getCountZero() {
        return countZero;
    }

    public int getCountOne() {
        return countOne;
    }

    public int[] getCount(){
        int[] get = new int[2];

        get[0] = countZero;
        get[1] = countOne;

        return get;
    }

    public static void main(String[] args) {
        피보나치함수_1003 application;
        application = new 피보나치함수_1003();
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        scanner.nextLine();

        while (test>0) {
            application.setCountOne(0);
            application.setCountZero(0);
            application.fibonacci(scanner.nextInt());
            System.out.println(application.getCountZero() + " " + application.getCountOne());

            test--;
        }

    }
}
