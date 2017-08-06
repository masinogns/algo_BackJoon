import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 6..
 */
public class 크로아티아_2941 {
    String inputString;
    Scanner scanner;

    public String getInputString() {
        return inputString;
    }

    public void setInputString() {
        scanner = new Scanner(System.in);
        inputString = scanner.nextLine();
    }

    public int checkAlpahbet(String inputString) {
        String[] alpahbet = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < alpahbet.length; i++){
            while (true){
                if (inputString.contains(alpahbet[i])){
                    inputString = inputString.replace(alpahbet[i], "1");
                }else break;
            }
        }

        return inputString.length();
    }

    public static void main(String[] args) {
        크로아티아_2941 application = new 크로아티아_2941();

        application.setInputString();
        String inputString = application.getInputString();
        int count = application.checkAlpahbet(inputString);
        System.out.println(count);
    }
}
