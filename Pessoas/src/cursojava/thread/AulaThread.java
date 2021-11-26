package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread procesando em paralelo*/
		new Thread() {
			
			public void run()/*Executa o que queremos*/ {
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
				/*Fim do c�digo em paralelo*/
					
				};
			}.start(); /*Liga a Thread que fica processando de forma paralela por tr�s*/
		
			
		/*C�digo do sistema do usu�rio continua o fluxo de trabalho*/
					
		/*Fluxo do sistema, cadastro de venda, emissao de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}
}
