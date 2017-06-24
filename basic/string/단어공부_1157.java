import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 24..
 */
public class 단어공부_1157 {
    /*
    *
 s=s.toUpperCase();
//모두 대문자로 바꾸기

s=s.toLowerCase();
/모두 소문자로 바꾸기
    * */
    public static void main(String[] args) {
        // A 65 ~ Z 90 ; a 97 ~ z 122

        Scanner scanner = new Scanner(System.in);
        String inputString = null;
        int[] ascii = new int[26];
        int[] copy;
        int index = 0;

        for (int i = 0; i < ascii.length; i++){
            ascii[i] = 0;
        }

        inputString = scanner.nextLine();
        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++){
            index = inputString.charAt(i)-97;
            ascii[index] = ascii[index]+1;
        }

        copy = Arrays.copyOf(ascii, 26);

        Arrays.sort(copy);
//        for (int i : ascii) System.out.print(i+" "); 이렇게하면 잘나옴.. 무슨 문제가 있슴
//        for (int i : ascii) System.out.print(i+' '); 이렇게하면 ascii로 나오고

//        for (int i : ascii) System.out.print(i+" ");
//        System.out.println("");
//        for (int i : copy) System.out.print(i+" ");

        if (copy[25]==copy[24]) System.out.println("?");
        else {
            for (int i = 0; i < ascii.length; i++){
                if (copy[25]==ascii[i]){
                    System.out.println((char)(i+65));
                }
            }
        }
    }
}
