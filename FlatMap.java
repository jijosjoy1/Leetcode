package asds;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMap {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(1, 3, 45, 56);
        List<List<Integer>> list3 = Arrays.asList(list1, list2);

        List<Integer> result = list3.stream()
                                     .flatMap(List::stream)
                                     .collect(Collectors.toList());
        

List<Integer> ss = list3.stream().flatMap(list->list.stream()).collect(Collectors.toList());


        System.out.println(result);
    }
}
