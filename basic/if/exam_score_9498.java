import java.util.Scanner;

/**
 * Created by masinogns on 2017. 6. 19..
 */
public class exam_score_9498 {
    static class cotrol{
        private int score;

        public cotrol() {
            score = -1;
        }

        public void printScore() {
            if (score >= 0 && score <= 100){
                if (score >= 90 && score <=100){
                    System.out.println("A");
                }else if (score >= 80 && score < 90){
                    System.out.println("B");
                }else if (score >= 70 && score < 80){
                    System.out.println("C");
                }else if (score >= 60 && score < 70){
                    System.out.println("D");
                }else {
                    System.out.println("F");
                }
            }else {
                System.out.println("there is no number beteween 0~100");
            }
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        cotrol cotroller = new cotrol();
        cotroller.setScore(number);
        cotroller.printScore();

    }
}
