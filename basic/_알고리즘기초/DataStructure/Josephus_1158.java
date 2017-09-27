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

    /**
     * 원탁에 둘러 싸 앉을 사람들을 생성하는 함수
     * @param peopleNumber
     */
    public void setJosephusArrays(int peopleNumber) {
        for (int i = 0; i < peopleNumber; i++){
            people.add(i, i+1);
        }
    }

    public ArrayList<Integer> getJosephusArrays() {
        return josephusArrays;
    }

    public void findOutJosephusArrays(int removeIndex) {

        // 규칙을 보니 3번 째 사람을 kill할 때, 실제 이동된 index는 -1을 한 2였다
        removeIndex -= 1;
        int minus = removeIndex;
        int size = people.size();


        // 사람이 0이면 다 죽은 것이기 때문에 그
        while (size > 0){

            // 원탁 한 바퀴를 돌면 people size보다 커지게 되서 index 0으로 가게 해줄 로직
            // 몫은 바퀴 수를 의미할 것이고 나머지는 removeIndex를 의미할 것이다
            removeIndex = removeIndex % size;

            //removeIndex에 해당하는 사람을 조세퍼스 배열에 추가하고 people permutation에서 삭제한다
            josephusArrays.add(people.get(removeIndex));
            people.remove(removeIndex);

            // removeIndex는 3이나 index의 시작이 0부터 시작하기 때문에
            // 0, 1, 2 형식으로 빼지므로 3이 아닌 2를 뺀다
            // List 삭제 시에 삭제된 index부터 시작되기 때문에 -1을 해
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
