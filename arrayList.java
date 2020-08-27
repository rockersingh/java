import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(89);
        numbers.add(78);
        numbers.add(5);

        Collections.sort(numbers, Collections.reverseOrder());

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
