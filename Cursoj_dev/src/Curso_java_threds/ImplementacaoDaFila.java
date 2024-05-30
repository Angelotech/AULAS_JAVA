package Curso_java_threds;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoDaFila extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoThread>();  /*ESTE CONSTRUTOR É USADO PARA CONSTRUIR UM FILA VAZIA THREAD*/
	public static void add(ObjetoThread objetoThread) { /*METODO RESPONSAVEL POR ADD A FILA  O OBJETOTHREAD ADICINADO SEUS ATRIBUTOS A FILA*/
		pilha_fila.add(objetoThread);/*METODO RESPONSAVEL POR ADICIONAR ELEMENTOS DA CLASSE OBJETO A PILHA*/
		
	}; 
	
	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();
		
		synchronized (iteracao) {/*BLOQUEAR O ACESSO A ESSA LISTA POR OUTROS PROCESSOS*/
			while (iteracao.hasNext()) /*ENQUANTO CONTER DADOS NA LISTA IRA PROCESSAR*/ {
				
				
				ObjetoThread processar = (ObjetoThread) iteracao.next();/*PEGAR OBJETO ATUAL*/
				/*LISTA GRANDE DE PROCESSO LISTA 10 MIL NOTAS GERAR UM ENVIO DE EMAIL
				 * AKI FICA OS PROCESSO DEMORADOS*/
				System.out.println("ola mundo-----------------------------");
				System.out.println(processar.getNome());
				System.out.print(processar.getEmail());
				iteracao.remove();
				try {
					Thread.sleep(100);/*TEMPO PARA DESCARGA DE MEMORIA*/
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		try {
			Thread.sleep(1000);/*PROCESSOU A LISTA E DEU UM TEMPO PARA DESCARGA*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
