import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void print(int i){
        System.out.println(i);
    }
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,3,4,5,5,6,9,7,8);

        //foreach
       // list.forEach(i->print(i));
        //list.forEach((i)-> System.out.print(i));
        //creating stream
        Stream<Integer> stream = list.stream();

        //limit
        Stream<Integer> stream1 = stream.limit(4);
        System.out.println(stream1.collect(Collectors.toList()));

        //map
        List<Integer> square = list.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println(square);

        //filter remove odd number
        List<Integer> even = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(even);

        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        System.out.println(list.stream().skip(1).collect(Collectors.toList()));

        System.out.println(list.stream().sorted().dropWhile(x->(x/2==1)).collect(Collectors.toList()));

        list.stream().takeWhile(i -> i/2 ==1).forEach(System.out::println);
    }
}
