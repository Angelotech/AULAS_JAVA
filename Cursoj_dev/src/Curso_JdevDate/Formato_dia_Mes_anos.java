package Curso_JdevDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formato_dia_Mes_anos {
	public static void main(String[] args) {
		
		LocalDate dia = LocalDate.now();
		
		System.out.println("a nossa data e " + dia.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
		System.out.println("o dia do mes é" + dia.getDayOfWeek());
		System.out.println("o dia do mes é " + dia.getDayOfMonth());
		System.out.println("de acordo com a quantidade de dias hj é o dia " +
		+ dia.getDayOfYear());
		System.out.println("o ano é " + dia.getYear());
		
	}

}
