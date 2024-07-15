package Curso_JdevDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*********** Gerando parcelas mensais e suas datas *************/
public class Gerando_parcelas_mensais_e_suas_datas {
	public static void main(String[] args) throws ParseException{
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2024");
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataInicial);
		
		for(int parcela = 1; parcela <= 12;parcela ++) {
			calendario.add(Calendar.MONTH, 1);	
			
			System.out.println("parcela de numero: " + parcela + 
			" com o vencimento em " + new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime()));
		}
		
			
			
	
		
	}

}
