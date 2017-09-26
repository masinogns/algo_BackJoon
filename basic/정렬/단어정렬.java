import java.util.*;

/**
 * Created by masinogns on 2017. 9. 26..
 */

class Word{
    int lenght;
    String word;

    public Word(int lenght, String word) {
        this.lenght = lenght;
        this.word = word;
    }

    public int getLenght() {
        return lenght;
    }

    public String getWord() {
        return word;
    }
}

class orderLenght implements Comparator<Word>{

    @Override
    public int compare(Word o1, Word o2) {

        int length1 = o1.getLenght();
        int length2 = o2.getLenght();

        if (length1 == length2){
            return o1.getWord().compareTo(o2.getWord());
        }

        return Integer.compare(length1, length2);
    }
}

public class 단어정렬 {
    public String[] solution(String[] strings) {
        int N = strings.length;
        Stack<String> stack = new Stack<>();
        Stack<String> TheOtherStack = new Stack<>();
        ArrayList<String> ret = new ArrayList<>();

        Word[] words = new Word[N];
        for (int i = 0; i < N; i++){
            words[i] = new Word(strings[i].length(), strings[i]);
        }

        Arrays.sort(words, new orderLenght());

        stack.push(words[0].getWord());
        for (int i = 1; i < N; i++){
            if (!words[i].getWord().equals(stack.peek())){
                stack.push(words[i].getWord());
            }
        }

        while (!stack.isEmpty())
            TheOtherStack.push(stack.pop());

        while (!TheOtherStack.isEmpty())
            ret.add(TheOtherStack.pop());


        return ret.toArray(new String[ret.size()]);
    }

    public static void main(String[] args) {
        단어정렬 application = new 단어정렬();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        String[] strings = new String[N];

        scanner.nextLine();

        for (int i = 0; i < N; i++){
            strings[i] = scanner.nextLine();
        }

        String[] ret;
        ret = application.solution(strings);

        for (String s : ret)
            System.out.println(s);
    }
}
