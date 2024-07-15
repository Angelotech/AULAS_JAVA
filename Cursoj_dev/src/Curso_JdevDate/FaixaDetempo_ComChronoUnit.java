package Curso_JdevDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/*DESCOBRINDO QUANTOS DIA TEM UMA FAIXA DE TEMPO*/
public class FaixaDetempo_ComChronoUnit {
	public static void main(String[] args) {
		/*between serve para comparar*/
		long dias = ChronoUnit.MONTHS.between(LocalDate.parse("2022-01-05"), LocalDate.now());
		System.out.println("passou " + dias);
			
		
		
		
		
		
	}
	
}
