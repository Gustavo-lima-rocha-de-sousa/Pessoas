package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> 
		pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
		}
	
		
	public void run() {
		System.out.println("Fila Rodando");
		
		while(true) {
		
		Iterator iteracao = pilha_fila.iterator();
		synchronized (iteracao) {/*Bloquear o acesso a esta lista por outro processos*/
			while(iteracao.hasNext()) { /*Enquanto conter dados na lista irá processar*/
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*Pega o objeto atual*/
				
				/*Processar nota fiscal*/
				/*Gerar uma lista enorme de PDF*/
				/*Gerar um envio em massa de email*/
				System.out.println("------------------");
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());
				
				iteracao.remove();
				
				try {
					Thread.sleep(100);/*Dar um tempo para descarga de memoria*/
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
			}	
		}
			
		try {
			Thread.sleep(1000);/*Processou toda a lista, da um tempo para limpesa de memoria*/
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		}
	
	}
	
}
