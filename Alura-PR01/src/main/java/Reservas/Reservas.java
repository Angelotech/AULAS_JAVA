package Reservas;

import java.util.Date;

public class Reservas {

    public void reservar() {
        System.out.println("Reserva realizada");


    }

   public void reservar(String data) {
        System.out.println("Reserva realizada no dia: " + data);
    }

    public void reservar(String data, int pessoas) {
        System.out.println("Reserva realizada para o dia " + data + "\nl" + "para: " + pessoas + " pessoas");
    }


}
