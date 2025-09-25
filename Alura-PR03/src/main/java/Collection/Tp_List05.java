package Collection;

import java.util.*;

public class Tp_List05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer,String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        Integer SR = 5;

        if(clientes.containsKey(SR)){
            System.out.println("cliente encontrado: " + clientes.get(SR));
        }else {
            System.out.println(" Cliente com ID não encontrado.");

        }


    }
}
