package Curso_JdevDate;

import java.time.Duration;
import java.time.Instant;

public class Tempo_De_Processo_Com_Intsant {

	public static void main (String[] args) throws InterruptedException  {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000); /*PODE SER UM PROCESSO EM QUE NÃO CONHECEMOS O TEMPO */
		
		/* colocasse i pois é uma declaração */
		Instant ifinal =Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println(" duração em nano segundo: " + duracao.toNanos());
		System.out.println(" duração em dias " + duracao.toDays());
		System.out.println(" duração em horas: " + duracao.toHours());
		System.out.println(" duração em minutos: " + duracao.toMinutes());


		
		
		
	
	}
}
