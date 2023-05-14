package Collection_map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int number = 201206504;
        String result = String.valueOf(number).chars().filter(p -> p != '0')
                .mapToObj(p -> String.valueOf((char) p)).collect(Collectors.joining())+
                String.valueOf(number).chars().filter(p -> p =='0')
                        .mapToObj(p -> String.valueOf((char) p)).collect(Collectors.joining());
        System.out.println(result);
    }
}
