package curso.java.excecao;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	/*Usado para executar código*/
	public static void main(String[] args) {
		
		
	
	String[] valores = {"Gustavo", "90", "Curso Java"};
	for (int pos = 0 ; pos < valores.length; pos++) {
		System.out.println("Valores na posição: " + (pos + 1) + " é= " + valores[pos]);
	}		
		
		/*Array pode ser de todos os tipos de dados e objetos também*/
		
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
		
	
		/*array sempre deve ter a quantiadade de posições definidas*/	
	double[] notas = new double[Integer.parseInt(posicoes)];
	
	
	for(int pos = 0; pos < notas.length; pos++) {
		String valor = JOptionPane.showInputDialog("Qual o Valor da Posição " + (pos +1) + " ?");
		notas[pos] = Double.valueOf(valor);
			}
	for (int pos = 0 ; pos < notas.length; pos++) {
		System.out.println("Nota: " + (pos + 1) + " é= " + notas[pos]);
	}
}
}