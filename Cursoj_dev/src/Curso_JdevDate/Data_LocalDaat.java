package Curso_JdevDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data_LocalDaat {
	public static void main (String[] args) {
		
		LocalDate dataHoras = LocalDate.parse("2019-10-06"); 
		LocalDate dataHorasV = LocalDate.parse("2020-08-06"); 
	/*	LocalDate dataHoras = LocalDate.now(); */
		
		for (int i = 1; i <= 12; i++) {
			
			dataHoras =  dataHoras.plusMonths(1);
			System.out.println("o vencimento da sua fatura é " + dataHoras.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		}
		
		if (dataHoras.isAfter(dataHorasV)) {
			System.out.println("passou o prazo de pagamento");
			
		} else {
			System.out.println("não passou o prazo de pagamento");
		}
				
		 
											/*adicionamos mais dias */
		/*System.out.println("Mais 5 dias: " + dataHoras.plusDays(5));
		System.out.println("Mais 5 dias: " + dataHoras.plusMonths(5));
		System.out.println("Mais 5 dias: " + dataHoras.plusWeeks(5));
		System.out.println("Mais 5 dias: " + dataHoras.plusYears(5));
		System.out.println("=====================================");
		System.out.println("Mais 5 dias: " + dataHoras.minusDays(5));
		System.out.println("Mais 5 dias: " + dataHoras.minusMonths(5));
		System.out.println("Mais 5 dias: " + dataHoras.minusWeeks(5));
		System.out.println("Mais 5 dias: " + dataHoras.minusYears(5)); */



		
		
		
	}

}
