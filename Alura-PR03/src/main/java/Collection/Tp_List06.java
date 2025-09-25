package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Tp_List06 {
    public static void main(String[] args) {

        List<String> lista =  List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> listafiltrada = lista.stream()
                .filter(l -> l.length() <= 5)
                .collect(Collectors.toList());

        System.out.println("esses saõ os que tem 5 caracteres: " + listafiltrada);


    }
}
