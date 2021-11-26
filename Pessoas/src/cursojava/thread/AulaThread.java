package cursojava.thread;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	
		for (int pos = 0; pos < 10; pos ++){
			
			/* Quero Executar essa envio de e-mail com um tempo de para ou tempo determinado */
			System.out.println("Executando alguma rotina, por exemplo envio de e-mail.");
			Thread.sleep(1000);
			System.out.println("Aguarde, estamos trabalhando nisso.");
		} 
			System.out.println("E-mail enviado");			
		
	}
}
