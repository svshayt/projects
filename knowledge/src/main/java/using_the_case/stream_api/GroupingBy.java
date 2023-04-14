package using_the_case.stream_api;

import model.Worker;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Semen", 21, 20000, "middle");
        Worker worker2 = new Worker("Alex", 32, 15000, "junior");
        Worker worker3 = new Worker("Sergey", 24, 25000, "middle");
        Worker worker4 = new Worker("Ivan", 19, 30000, "senior");
        Worker worker5 = new Worker("Anna", 28, 10000, "junior");

        List<Worker> workers = List.of(worker1, worker2, worker3, worker4, worker5);

        // Группировка списка рабочих по их должности (разбиение на списки)
        // Map<String, List<Worker>>
        var result1 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition, Collectors.toList()));
        System.out.println(result1);

        // Группировка списка рабочих по их должности (разбиение на множества)
        // Map<String, Set<Worker>>
        var result2 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition, Collectors.toSet()));
        System.out.println(result2);

        // Подсчет количества рабочих, занимаемых конкретную должность
        // Map<String, Long>
        var result3 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition, Collectors.counting()));
        System.out.println(result3);

        // Группировка списка рабочих по их должности, при этом нас интересуют только имена
        // Map<String, Set<String>>
        var result4 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition,
                Collectors.mapping(Worker::getName, Collectors.toSet())));
        System.out.println(result4);

        // Расчет средней зарплаты для данной должности
        // Map<String, Double>
        var result5 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition,
                Collectors.averagingInt(Worker::getSalary)));
        System.out.println(result5);

        // Группировка списка рабочих по их должности, рабочие представлены только именами единой строкой
        // Map<String, String>
        var result6 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition,
                Collectors.mapping(Worker::getName, Collectors.joining(", ", "{", "}"))));
        System.out.println(result6);

        // Группировка списка рабочих по их должности и по возрасту | Map<String, Map<Integer, List<Workers>>>
        var result7 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition,
                Collectors.groupingBy(Worker::getAge)));
        System.out.println(result7);

        /*
        {senior=[Worker(name=Ivan, age=19, salary=30000, position=senior)], middle=[Worker(name=Semen, age=21, salary=20000, position=middle), Worker(name=Sergey, age=24, salary=25000, position=middle)], junior=[Worker(name=Alex, age=32, salary=15000, position=junior), Worker(name=Anna, age=28, salary=10000, position=junior)]}
        {senior=[Worker(name=Ivan, age=19, salary=30000, position=senior)], middle=[Worker(name=Semen, age=21, salary=20000, position=middle), Worker(name=Sergey, age=24, salary=25000, position=middle)], junior=[Worker(name=Alex, age=32, salary=15000, position=junior), Worker(name=Anna, age=28, salary=10000, position=junior)]}
        {senior=1, middle=2, junior=2}
        {senior=[Ivan], middle=[Semen, Sergey], junior=[Alex, Anna]}
        {senior=30000.0, middle=22500.0, junior=12500.0}
        {senior={Ivan}, middle={Semen, Sergey}, junior={Alex, Anna}}
        {senior={19=[Worker(name=Ivan, age=19, salary=30000, position=senior)]}, middle={21=[Worker(name=Semen, age=21, salary=20000, position=middle)], 24=[Worker(name=Sergey, age=24, salary=25000, position=middle)]}, junior={32=[Worker(name=Alex, age=32, salary=15000, position=junior)], 28=[Worker(name=Anna, age=28, salary=10000, position=junior)]}}
        */
    }
}
