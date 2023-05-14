package Collection_map;

import java.util.HashMap;
import java.util.Map;

public class Map_TimeSeries {
    public static void main(String[] args) {


        Map<Integer, Double> seriesA = new HashMap<>();
        seriesA.put(1, 1.0);
        seriesA.put(2, 1.5);
        seriesA.put(3, 2.0);
        Map<Integer, Double> seriesB = new HashMap<>();
        seriesB.put(1, 1.0);
        seriesB.put(3, 2.5);
        seriesB.put(5, 1.5);

        sumAllTiming(seriesA, seriesB);
    }

    private static void sumAllTiming(Map<Integer, Double> seriesA, Map<Integer, Double> seriesB) {

        Map<Integer, Double> result = new HashMap<>();
        seriesA.forEach((key, value) -> result.merge(key, value, Double::sum));
        seriesB.forEach((key, value) -> result.merge(key, value, Double::sum));
        System.out.println(result);

    }
}