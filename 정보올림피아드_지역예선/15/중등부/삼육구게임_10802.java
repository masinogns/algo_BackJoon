import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 26..
 */
public class 삼육구게임_10802 {
    static class control{

        int[] startAndEnd = new int[2];

        public void setStartAndEnd() {
            Scanner scanner = new Scanner(System.in);
            startAndEnd[0] = Integer.parseInt(scanner.next());
            startAndEnd[1] = scanner.nextInt();

        }

        public int[] getStartAndEnd() {
            return startAndEnd;
        }

        public int findClapNumberOfTime(int[] startAndEnd) {
            int clap = 0;

            for (int i = startAndEnd[0]; i <= startAndEnd[1]; i++){
                String length = String.valueOf(startAndEnd[1]);
                int number = 10*length.length();
                if (i%3 != 0){
                    for (int j = 1; j < number; j+=10){

                        if (i%number == 3) clap++;
                        else if (i%number == 6)clap++;
                        else if (i%number == 9)clap++;
                        else continue;
                    }
                }else clap++;
            }

            return clap;
        }
    }

    public static void main(String[] args) {
        control controller = new control();

        controller.setStartAndEnd();
        int result = controller.findClapNumberOfTime(controller.getStartAndEnd());
        System.out.println(result);


    }
}
