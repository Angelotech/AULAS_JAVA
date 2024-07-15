package Curso_JdevDate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class API_DATE_TIME {
	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		
		 System.out.println("data " + dataAtual);
		 
		 LocalTime tempo = LocalTime.now();
		 
		 System.out.println("tempo " + tempo.format(DateTimeFormatter.ofPattern("HH:mm")));
		 
		 LocalDateTime dataH = LocalDateTime.now();
		 																				/*data e hora formato padrao*/			
		 System.out.println("data e hora atual: " + dataH.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		 
		 
		 
	}

}
