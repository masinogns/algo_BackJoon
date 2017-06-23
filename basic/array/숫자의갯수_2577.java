import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 23..
 */
public class 숫자의갯수_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int result= num1* num2* num3;
        int[] number= new int[10];
        while(result>0)
        {
            number[result%10]++;
            result/=10;
        }

        for(int a: number)
        {//각 숫자 갯수 출력
            System.out.println(a);
        }
    }
}
