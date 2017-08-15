import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 15..
 *
 * 조세퍼스 문제
 *
 * 1 단계 : 사람수 7명, 제거 인덱스 3(0, 1, 2번째 제거)
 * 2 단계 : 사람수 6명, 제거 인덱스 5(0, 1, 2(x), 3, 4, 5번째 제거)
 * 3 단계 : 사람수 5명, 제거 인덱스 2(0, 1, 2(x), 3, 4, 5(x), 6, 0, 1번째 제거)
 * 이 때 인덱스가 사람수 보다 커지면서 인덱스를 감소시켜줘야 하는 로직이 필요하다
 * removeIndex % people.size() ?!
 */
public class Josephus_1158 {

    private int peopleNumber;
    private int removeNumber;
    private ArrayList<Integer> josephusArrays;
    private LinkedList<Integer> people;

    public Josephus_1158() {
        josephusArrays = new ArrayList<>();
        people = new LinkedList<>();
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public void setRemoveNumber(int removeNumber) {
        this.removeNumber = removeNumber;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public int getRemoveNumber() {
        return removeNumber;
    }

    public void setJosephusArrays(int peopleNumber) {
        for (int i = 0; i < peopleNumber; i++){
            people.add(i, i+1);
        }
    }

    public ArrayList<Integer> getJosephusArrays() {
        return josephusArrays;
    }

    public void findOutJosephusArrays(int removeIndex) {

        int minus = removeIndex - 1;
        int size = people.size();
        removeIndex -= 1;

        while (size > 0){

            removeIndex = removeIndex % size;
            josephusArrays.add(people.get(removeIndex));
            people.remove(removeIndex);

            removeIndex += minus;
            size -= 1;

        }

    }

    public static void main(String[] args) {
        Josephus_1158 application = new Josephus_1158();

        // 사람 수와 몇 번째 사람을 제거할 것인지 입력
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = scanner.nextInt();
        int removeIndex = scanner.nextInt();

        application.setPeopleNumber(peopleNumber);
        application.setRemoveNumber(removeIndex);

        // 실제로 처리하는 곳
        application.setJosephusArrays(application.getPeopleNumber());
        application.findOutJosephusArrays(application.getRemoveNumber());

        // acmicpc.net에서 원하는 출력 값을 만들기 위해서
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");

        for (Integer integer : application.getJosephusArrays()){
            stringBuilder.append(integer+", ");
        }
        stringBuilder.replace(stringBuilder.length()-2, stringBuilder.length(), "");
        stringBuilder.append(">");

        System.out.println(stringBuilder);
    }
}
