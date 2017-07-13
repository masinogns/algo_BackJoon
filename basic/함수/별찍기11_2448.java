/**
 * Created by masinogns on 2017. 7. 11..
 */
public class 별찍기11_2448 {
    public static void main(String[] args) {
        String space = " ";
        String[] strings = new String[3];
        strings[0] = "*";
        strings[1] = "* *";
        strings[2] = "*****";

        StringBuilder stringBuilder = new StringBuilder();

        int j = 2;
        int result = 3;
        for (int i = 0; i < result; i++){
            for (int a = 2; a < 3; a--){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
