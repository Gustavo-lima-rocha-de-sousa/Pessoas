package curso.java.excecao;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	/*Usado para executar c�digo*/
	public static void main(String[] args) {
		
		
	
	String[] valores = {"Gustavo", "90", "Curso Java"};
	for (int pos = 0 ; pos < valores.length; pos++) {
		System.out.println("Valores na posi��o: " + (pos + 1) + " �= " + valores[pos]);
	}		
		
		/*Array pode ser de todos os tipos de dados e objetos tamb�m*/
		
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o Array deve ter?");
		
	
		/*array sempre deve ter a quantiadade de posi��es definidas*/	
	double[] notas = new double[Integer.parseInt(posicoes)];
	
	
	for(int pos = 0; pos < notas.length; pos++) {
		String valor = JOptionPane.showInputDialog("Qual o Valor da Posi��o " + (pos +1) + " ?");
		notas[pos] = Double.valueOf(valor);
			}
	for (int pos = 0 ; pos < notas.length; pos++) {
		System.out.println("Nota: " + (pos + 1) + " �= " + notas[pos]);
	}
}
}