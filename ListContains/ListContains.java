package ListContains;

import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        for (Integer element : list) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
