package Collection;

import java.util.*;

public class Tp_List03 {
    public static void main(String[] args) {
       List<String> eventos = new ArrayList<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> event  = new HashSet<>(eventos);

        System.out.println("Esses são os eventos "+ event);








    }




}
