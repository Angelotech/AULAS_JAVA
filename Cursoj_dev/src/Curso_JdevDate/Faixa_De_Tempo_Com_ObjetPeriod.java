package Curso_JdevDate;

import java.time.LocalDate;
import java.time.Period;

public class Faixa_De_Tempo_Com_ObjetPeriod {
	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(2000, 12, 11);
		LocalDate dataNova = LocalDate.of(2002, 8, 7);
		
		System.out.println("data antiga " + dataAntiga.isAfter(dataNova)); 
		System.out.println("data novca " + dataNova.isBefore(dataAntiga));
		
		if (dataAntiga.equals(dataNova)) {
			System.out.println("as datas são iguais ");
			
		} else {
			System.out.println("as datas não são iguais ");

		}
		
		/* PERIODO ENTRE AS DATAS*/
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("periodo de tempo entre as dats são dias " + periodo.getDays());
		System.out.println("periodo de tempo entre as dats são meses " + periodo.getMonths());
		System.out.println("periodo de tempo entre as dats são anos " + periodo.getYears());


		
		
	}

}
