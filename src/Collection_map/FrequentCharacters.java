package Collection_map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequentCharacters {
    public static void main(String[] args) {
        String input = "ilovejavatEchie";
        Map<String, Long> map = Arrays.stream(input.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        List<String> duplicateElement = Arrays.stream(input.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(s->s.getValue()>1).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElement);

        List<String> uniqElements = Arrays.stream(input.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(uniqElements);

        String firstNonRepeatElement = Arrays.stream(input.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(x-> x.getValue()==1).findFirst().get().getKey();
        System.out.println("first non repeated element = " + firstNonRepeatElement);

        int[] numbers = {2,9,7,21,11,4};
        Integer secondHighestNumber = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();


        System.out.println(secondHighestNumber);

        String[] strArray = {"java", "techie", "springBoot", "microservices"};
        String longestString = Arrays.stream(strArray)
                .reduce((word1,word2)-> word1.length()>word2.length()?word1:word2).get();
        System.out.println(longestString);

        int[] newNumbers = {1,2,9,7,21,11,4};
        List<String> numbersStatWithOne = Arrays.stream(newNumbers).boxed().map(x->x+"")
                .filter(s->s.startsWith("1")).collect(Collectors.toList());
        System.out.println(numbersStatWithOne);

        List<String> nos = Arrays.asList("1","2","3","4");
        String result = String.join("-",nos);
        System.out.println(result);

        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::print);

    }

}
