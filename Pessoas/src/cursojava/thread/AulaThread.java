package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread procesando em paralelo envio do e-mail*/
		Thread threadEmail = new Thread(thread1);		
		threadEmail.start();
							
				
		/*------------------------------ Divis�o das Threads*/
			
			/*Thread procesando em paralelo envio da nota fiscal*/
			Thread threadNotaFiscal = new Thread(thread2);
			threadNotaFiscal.start();	
						
		/*C�digo do sistema do usu�rio continua o fluxo de trabalho*/
					
		/*Fluxo do sistema, cadastro de venda, emissao de nota fiscal, algo do tipo*/
			
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}
	private static Runnable thread2 = new Runnable() {
		

		public void run() {
			/*Executa o que queremos*/ {
				/*C�digo da rotina*/
				for (int pos = 0; pos < 10; pos ++){
				/* Quero Executar essa envio de nota fiscal com um tempo de para ou tempo determinado */
				System.out.println("Executando alguma rotina, por exemplo envio de Nota Fiscal.");
				
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				}
				
				} 
				/*Fim do c�digo em paralelo*/
					
				};
			
		}
	};
	
	
	
	private static Runnable thread1 = new Runnable() {
		
		public void run() {
		
			/*C�digo da rotina*/
			for (int pos = 0; pos < 10; pos ++){
			/* Quero Executar essa envio de e-mail com um tempo de para ou tempo determinado */
			System.out.println("Executando alguma rotina, por exemplo envio de e-mail.");
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
			} 
		
				
			};
			
		
	};
	
}
