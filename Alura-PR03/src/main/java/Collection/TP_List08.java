package Collection;

import java.util.ArrayList;
import java.util.List;

public class TP_List08 {
    public static void main(String[] args) {

        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double soma = notas.stream().
                reduce(0.0,Double::sum);

        double media = soma/notas.size();
        double minimo = notas.stream().min(Double::compare).get();
        double maximo = notas.stream().max(Double::compare).get();


        System.out.println("A media das somas: " + media);
        System.out.println("A media das somas: " + minimo);
        System.out.println("A media das somas: " + maximo);




    }

}
/*
acumulado → é a soma parcial (o que já foi somado até agora)
numero → é cada elemento individual da lista */
