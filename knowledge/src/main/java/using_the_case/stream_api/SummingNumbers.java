package using_the_case.stream_api;

import model.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingNumbers {
    public static void main(String[] args) {
        useStreamReduce();
        useStreamCollect();
        useIntStreamSum();
        useStreamSumWithMap();
        useStreamSumWithObjects();
        useStreamSumWithString();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void useStreamReduce() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sumOld = integers.stream().reduce(0, (a, b) -> a + b);
        Integer sum = integers.stream().reduce(0, Integer::sum);
        System.out.println(sumOld);
        System.out.println(sum);
        Integer sumOwn = integers.stream().reduce(0, SummingNumbers::add);
        System.out.println(sumOwn);
    }

    public static void useStreamCollect() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
    }

    public static void useIntStreamSum() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    public static void useStreamSumWithMap() {
        Map<Object, Integer> map = new HashMap<>();
        map.put("N1", 1);
        map.put("N2", 2);
        map.put("N3", 3);
        map.put("N4", 4);
        map.put("N5", 5);

        Integer sum = map.values()
                .stream()
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println(sum);
    }

    public static void useStreamSumWithObjects() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, 100));
        items.add(new Item(2, 200));
        items.add(new Item(3, 300));
        items.add(new Item(4, 400));
        items.add(new Item(5, 500));
        int sum = items.stream()
                .map(Item::getPrice)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    public static void useStreamSumWithString() {
        String str = "Stream100 200 300stream stre400am 500";
        int sum = Arrays.stream(str.split(" "))
                .filter(s -> s.matches("\\d+"))
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println(sum); // 700
    }
}
