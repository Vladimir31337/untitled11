package Lesson9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> arrayList = Arrays.asList("13","20","8","16","5","10");
        // как сделать стримы
        //   System.out.println
        Arrays.asList("13","20","8","16","5","10").stream()
                .map(x -> Integer.parseInt(x))
                .filter((x) -> x < 15)
                .sorted((x, y) -> x - y)
                .distinct()
                .map((x) -> String.valueOf(x))
                //терминальные операции
                .forEach(x-> System.out.println(x));
        //       .collect(Collectors.joining(",","Элементы ", " собранны."))
        //      );


  /*      List<String> arrayList = Arrays.asList("13", "20", "8", "16", "5", "10");

        // как сделать стримы

        List<Integer> list = arrayList.stream()
                //методы
                .map(x -> Integer.parseInt(x))
                .filter((x) -> x < 15)
                .sorted((x, y) -> x - y)
                //терминальные операции
                .collect(Collectors.toList());



   */


        //filter() -> отбор значений по условию (x) -> и условие
        //distinct() отбор уникальных значений
        //map() преобразование из одного типа в другой (был String стал Integer)
        //limit() -> ограничение количества эдементов (оставляет первые n элементов)
        //skip() -> пропускает количество элементов(пропускает их)
        //sorted() -> сортировка ( принимает 2 параметра (объект1 объект2 из потока), работает как Comparable)


//collect(toLIst, toMap,  toSet) -> превращает поток в выбранную коллекцию
        //joining() получить отформатированную строку
        //forEach() пройтись по каждому элементу и сделать что - то
        //Count() подсчет количество
        //reduce()

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);
        stream1.reduce((o1, o2) -> o1 > o2 ? o1 : o2).ifPresent(System.out::println);




        // как сделать стримы
        // 1) коллекции Map, List, Set
        Map<String, Integer> hashMap = new HashMap<>();
        Stream<String> stream = hashMap.keySet().stream();
        //2 массивы
        Integer[] arr = new Integer[10];
        //  Stream<Integer> stream1 = Arrays.stream(arr);
        //3 произвольный набор
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7);



        //  System.out.println(list);

    }


}
