package Curso_JdevDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/****************************CALCULO DE DIA MES E ANO USANDO O CALENDAR********/

public class DateCalendar {
	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance(); /*PEGA A DATA DE HJ*/
		
		try {
			calendario.setTime(new SimpleDateFormat("dd-HH-YYYY").parse("10-05-2024"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*SOMA DO MES ATUAL + DIAS*/
		calendario.add(calendario.DAY_OF_MONTH,180);
		calendario.add(calendario.MONTH,3);
		calendario.add(calendario.YEAR,1);

		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
		}
	
	
		
	}
	
