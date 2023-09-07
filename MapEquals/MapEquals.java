package MapEquals;

import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        if (map1.size() != map2.size()) {
            return false;
        }
        for (String key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                return false;
            }
            if (!map1.get(key).equals(map2.get(key))) {
                return false;
            }
        }
        return true;
    }
}
