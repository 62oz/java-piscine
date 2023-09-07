package SetOperations;


 import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<Integer>();
        union.addAll(set1);
        union.addAll(set2);
        return union;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<Integer>();
        for (Integer element : set1) {
            if (set2.contains(element)) {
                intersection.add(element);
            }
        }
        return intersection;
    }
}
