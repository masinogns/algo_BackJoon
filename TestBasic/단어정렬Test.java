import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 26..
 */
public class 단어정렬Test {

    단어정렬 application = new 단어정렬();

    @Test
    public void test1() throws Exception {
        String[] words = new String[]{
                "but","i","wont","hesitate",
                "no","more","no","more","it",
                "cannot","wait","im","yours"
        };

        String[] ret = new String[]{
                "i",
                "im",
                "it",
                "no",
                "but",
                "more",
                "wait",
                "wont",
                "yours",
                "cannot",
                "hesitate"
        };

        assertArrayEquals(ret, application.solution(words));
    }
}