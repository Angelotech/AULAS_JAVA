package Curso_java;

import javax.swing.JOptionPane;
/*TRANSFORMANDO AS THREADS EM OBJETOS MANIPULADOS*/
/*USANDO O RUNNABLE (INTERFACE DA THREDS) PARA FACILITAR A LEITURA DO CODIGO*/
/*O METODO TEM QUE SER USADO FORA DO STATICO*/
public class AULA_4 {
	public static void main(String[] args){
		Thread theadEmail = new Thread(thread1);
		theadEmail.start();
		Thread theadContato = new Thread(thread2);
		theadContato.start();
		JOptionPane.showMessageDialog(null,"sistema continua executando");
		
		
		
		
		
	
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		/*O RUN É O MESMO CODIGO DA THRED SEM SER O OBJETO*/
		public void run() {
			/*O CODIGO QUE EU QUERO EXECUTAR A THRED FICA AKI*/
			// TODO Auto-generated method stub
			
			System.out.print("este codigo executar paralelo");
			for(int i=0; i < 5; i++) {
				System.out.println("estou em execução " + i);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.print("este codigo executa a segunda função");
			for(int f =0; f<5; f++){
				System.out.print("segunda thread em execução " + f);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			
		}
	};
		
		
		
	};
	
	
}
