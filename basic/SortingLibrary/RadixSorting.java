import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by masinogns on 2017. 8. 17..
 */
public class RadixSorting {
    private ArrayList arrayList;
    private ArrayList<Integer> result;

    public RadixSorting() {
        result = new ArrayList();
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void sorting(ArrayList<Integer> arrayList) {
        Queue[] queues = construcQueueArray();

        int maxNumber = getMaxNumberInArrayList(arrayList);
        int len = getIntergerLength(maxNumber);

        int val = 0;

        for (int j = len-1; 0 <= j; j--) {
            result = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++){
                val = (int) (arrayList.get(i)% Math.pow(10, len-j));
                val = (int) (val / Math.pow(10, len-j-1));

                queues[val].offer(arrayList.get(i));
            }

            for (Queue queue : queues){
                // queue에 마지막 요소 값이 안나오는 경향이 있었지만 해결 while문으로.
                while (queue.peek()!=null){
                    result.add((Integer) queue.poll());
                }
            }

        }


    }

    private int getIntergerLength(int inputNumber) {
        int len = 0;
        len = (int)(Math.log10(inputNumber)+1);

        return len;
    }

    private int getMaxNumberInArrayList(ArrayList<Integer> arrayList) {
        int maxNumber = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if (maxNumber < arrayList.get(i)){
                maxNumber = arrayList.get(i);
            }
        }

        return maxNumber;
    }

    private Queue[] construcQueueArray() {
        Queue[] queues = new Queue[10];

        for (int i = 0; i < 10; i++){
            queues[i] = new PriorityQueue();
        }

        return queues;
    }


    public ArrayList sortingResult() {
        return result;
    }
}
