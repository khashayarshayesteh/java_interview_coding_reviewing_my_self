package Collection_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_SortedByValues {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<String, Integer>();
        unsortedMap.put("apple", 4);
        unsortedMap.put("orange", 2);
        unsortedMap.put("banana", 1);
        sortingBaseOnValue(unsortedMap);

    }

    private static void sortingBaseOnValue(Map<String, Integer> unsortedMap) {
        Map<String,Integer> sortedMap = unsortedMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new,(map,entry) -> map.put(entry.getKey(), entry.getValue()),LinkedHashMap::putAll);

        System.out.println(sortedMap);
    }
}


