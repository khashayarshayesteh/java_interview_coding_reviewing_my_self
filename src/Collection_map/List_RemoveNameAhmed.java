package Collection_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_RemoveNameAhmed {
    public static void main(String[] args) {


        List names = new ArrayList(Arrays.asList("Ahmed", "Ali", "Amir"));
        System.out.println(names);

        System.out.println(names.stream().filter(p -> p != "Ahmed").collect(Collectors.toList()));

    }

}
