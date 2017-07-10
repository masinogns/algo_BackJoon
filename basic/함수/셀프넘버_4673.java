/**
 * Created by masinogns on 2017. 7. 10..
 */
public class 셀프넘버_4673 {

    public static void main(String[] args) {

        boolean[] isNotSelfNumber = new boolean[10000];

        int a,b,c,d,n = 0;

        for (int i = 1; i < 10000; i++){
            n = 0;

            a = i / 1000;
            b = (i / 100)%10;
            c = (i / 10)%10;
            d = i % 10;

            n = i+a+b+c+d;

            if (n < 10000){
                isNotSelfNumber[n] = true;
//                System.out.println(n);
            }else continue;
        }

        for (int i = 1; i < 10000; i++){
            if (!isNotSelfNumber[i]){
                System.out.println(i);
            }
        }
    }
}
