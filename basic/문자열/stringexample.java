import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 6..
 */
public class stringexample {
    public static void main(String[] args) {
//        eee();

        int[] flags = new int[26];
        Arrays.fill(flags, 0);

        System.out.println('z'-'a');
        System.out.println(flags['b'-'a']);
    }

    private static void eee() {
        String base = "lovedlovedlovedloved";
        String toRemove = "lov";

        int count = 0;
        while (true) {
            if (base.contains(toRemove)) {
                base = base.replaceFirst(toRemove, "");
                count++;
            } else break;
        }
        System.out.println(base);
        System.out.println(count);
    }
}
