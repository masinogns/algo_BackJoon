import java.util.*;

/**
 * Created by masinogns on 2017. 8. 7..
 */
public class ExampleOfList {
    public void exampleOfArray(){
        System.out.println("Example Of Array");
        System.out.println("");

        //Creating Array
        String[] stringArray = new String[10];
        stringArray[0] = "kihoon";
        stringArray[1] = "narea";

        // Print Array through for
        for (String i : stringArray){
            System.out.println(i);
        }
    }

    public void exampleOfArrayList(){
        System.out.println("Example Of Array List");
        System.out.println("");

        //Creating Array List
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("kihoon");
        stringArrayList.add("narae");
        stringArrayList.add("lllll");

        // Print Array List through for
        for (String i : stringArrayList){
            System.out.println(i);
        }

        // Print Array List through iterator
        Iterator iterator = stringArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void exampleOfArrayList2(){

        System.out.println("Example of Array List 2");
        System.out.println("");

        //Creating Array List
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(10);
        integerArrayList.add(2);

        // Collections의 sorting 전
        for (int i : integerArrayList){
            System.out.println(i);
        }

        // Collections의 sorting 후, 오름차순 정렬이 된다
        Collections.sort(integerArrayList);

        for (int i : integerArrayList){
            System.out.println(i);
        }

        Object[] array = integerArrayList.toArray();
        for (Object i : array){
            System.out.println(i);
        }
    }

    public void exampleOfLinkedList(){
        System.out.println("Example of Linked List");
        System.out.println("");

        //Creating Linked List
        LinkedList<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("kihoon");
        stringLinkedList.add("narae");

        // Print Linked List through iterator
        Iterator<String> iterator = stringLinkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void run(){
        ExampleOfList application = new ExampleOfList();
        application.exampleOfArray();
        application.exampleOfArrayList();
        application.exampleOfLinkedList();
    }
    public static void main(String[] args) {

        ExampleOfList application = new ExampleOfList();
        application.exampleOfArrayList2();
    }
}
