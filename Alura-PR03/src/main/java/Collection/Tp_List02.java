package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Tp_List02 {
    public static void main(String[] args) {
        List<String> funcionarios  = new LinkedList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("resultado da lista " + funcionarios.size() +  " a segunda pessoa é: " + funcionarios.get(1));





    }
}

