package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tp_List07 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> num = numeros.stream()
                .map(n -> n *n)
                .collect(Collectors.toList());
        System.out.println("os numeros a quadrado são: " + num);




    }
}
