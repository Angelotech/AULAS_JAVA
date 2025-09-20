package org.example;


import Reservas.Reservas;
import Reservas.ReservasVip;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");


        Reservas r = new Reservas();
        ReservasVip vip = new ReservasVip();
        r.reservar();
        r.reservar("10/04");
        r.reservar("12/04", 4);

        vip.reservar();






    }








}