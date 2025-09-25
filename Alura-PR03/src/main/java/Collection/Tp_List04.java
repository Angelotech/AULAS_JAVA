package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Tp_List04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer,String> cadastro = new HashMap<>();

        for(int i = 1; i<=5; i++){

            System.out.println("digte o nome da pessoa: ");
            String nome = scanner.nextLine();
            cadastro.put(i,nome);

        }
        scanner.close();
        System.out.println("O nome do cliente com ID 2 é: " + cadastro.get(2));
    }
}
