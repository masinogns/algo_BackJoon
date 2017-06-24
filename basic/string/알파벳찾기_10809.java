import java.util.Scanner;

public class 알파벳찾기_10809 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []result=new int[26];
        for (int i = 0; i < 26; i++) {
            result[i]=-1;
        }

        String temp=scanner.nextLine();

        for (int i = 0; i < temp.length(); i++) {
            if(result[temp.charAt(i)-97]==-1){
                result[temp.charAt(i)-97]=i;
            }


        }
        for (int i = 0; i < 26; i++) {
            System.out.print(result[i]+" ");
        }
    }

}
