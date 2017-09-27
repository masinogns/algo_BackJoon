import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by masinogns on 2017. 8. 15..
 */
public class linkedlistExample {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();


        for (int i = 0; i < 10; i ++){
            integers.add(i);
        }

        System.out.println(integers.get(3));
        System.out.println(integers.get(0));

//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < integers.size(); i ++){
//            arrayList.add(integers.get(3));
//            integers.remove(3);
//
//        }
//
//        Iterator iterator = arrayList.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
