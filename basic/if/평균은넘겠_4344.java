import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 27..
 */
public class 평균은넘겠_4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcaseNumber;
        int innerTestcase;
        int[] testcaseInput;
        double result;
        int count;
        testcaseNumber= scanner.nextInt();


        for (int i = 0; i < testcaseNumber; i++){
            result = 0;
            count = 0;

            innerTestcase = Integer.parseInt(scanner.next());
            testcaseInput = new int[innerTestcase];

            for (int j = 0; j < innerTestcase; j++){
                testcaseInput[j] = Integer.parseInt(scanner.next());
                result += testcaseInput[j];
            }

            result = result/innerTestcase;

            for (int x = 0; x < innerTestcase; x++){

                if (result < testcaseInput[x]) {
                    count++;
                }

            }

            result = (double) count/innerTestcase*100;
            String ss = String.format("%.3f%%",  result);
            System.out.println(ss);
        }




    }
}
