package Curso_JdevDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Java {
	public static void main(String[] args) throws ParseException{
		
		/*VENCIMENTO DE BOLETO */
		SimpleDateFormat simpleDateFormta = new SimpleDateFormat("dd-MM-yyy");
		Date datavencimento = simpleDateFormta.parse("19-05-2024");
		Date dataAtual = simpleDateFormta.parse("20-05-2024");
		
		if (datavencimento.after(dataAtual)) { /*after maior*/
			System.out.println("sua fatura esta em dia");
			
		} else {
			System.out.println("sua fatura esta em vencido");

		}
			if (datavencimento.before(dataAtual)) { /*before menor*/
				System.out.println("sua fatura esta em vencido");
				
			} else {
				System.out.println("sua fatura esta em dia");
	
			}
			
			
		
		
		
	/**	Calendar calendario = Calendar.getInstance();
		Date data = new Date();
		
		/************ SIMPLE DATE FORMAT **********/
		
		/*inicio dde um objeto **/
	/**	SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("data atual padrão " + simpleDateformat.format(data));
		System.out.println("retorna um objeto data" + simpleDateformat.parse("25-06-2021"));
		System.out.println(calendario.get(Calendar.DATE));
		
		System.out.println("Calendario formatado " + simpleDateformat.format(calendario.getTime()));
		
		***/
		
	}

}
