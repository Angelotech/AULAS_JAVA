package Curso_java;

import javax.swing.JOptionPane;

/*PROCESSAMENTO CONCORRENTE ENTRE DUAS THRED*/
public class AULA_3 {
public static void main (String[] args) throws InterruptedException {
		
		new Thread() {
			public void run() {/*EXECUTA O QUE NOS QUEREMOS FAZER*/
				/*CODIGO DA ROTINA*/
				

				/*LINHA DO CODIGO QUE QUERO EXECUTAR EM PARELO*/
				System.out.print("CODIGO QUE EXECUTA EM PARARELO");
				for(int i = 0; i < 10; i ++) {
					
					/*QUERO EXECUTAR ESSE ENVIO E COM UM TEMPO DE PARADA, OU ENTRAR COM UM TEMPO DETERMINADO*/
					System.out.println("EXECUTANDO ENVIO DE EMAIL " + i);
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} /*DA UM TEMPO NA EXECUÇÃO*/
					
					System.out.println("executando com tempo de parada");
				}
				
			}
		}.start();/*START LIGA A THRED QUE FICA EM PROCESSAMENTO EM PARALELO*/
		
		/************************************************************************/	
		
		new Thread() {
			public void run() {/*EXECUTA O QUE NOS QUEREMOS FAZER*/
				/*CODIGO DA ROTINA*/
				

				/*LINHA DO CODIGO QUE QUERO EXECUTAR EM PARELO*/
				System.out.print("CODIGO QUE EXECUTA EM PARARELO");
				for(int i = 0; i < 10; i ++) {
					
					/*QUERO EXECUTAR ESSE ENVIO E COM UM TEMPO DE PARADA, OU ENTRAR COM UM TEMPO DETERMINADO*/
					System.out.println("EXECUTANDO CONSULTA DE DADOS" + i);
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					} /*DA UM TEMPO NA EXECUÇÃO*/
					
					System.out.println("executando com tempo de parada");
				}
				
			}
		}.start();
		
		
		/*FLUXO DO SISTEMA, CADRASTRO DE PESSOAS, CONSULTA DE NOTAS FISCAL ALGO DO TIPO*/
		
		JOptionPane.showMessageDialog(null,"sistema continua executando");
		
	}

	

}
