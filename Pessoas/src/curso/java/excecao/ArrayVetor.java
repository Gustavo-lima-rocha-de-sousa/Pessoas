package curso.java.excecao;

import javax.swing.JOptionPane;

import Aluno.Aluno;
import Aluno.Disciplina;

public class ArrayVetor {
	
	/*Usado para executar c�digo*/
	public static void main(String[] args) {
		double[] notas = {8.8,9.7,7.6,6,8};
		double[] notaLogica = {7.1,5.7,9.6,7,8};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo Lima Rocha de Sousa");
		aluno.setNomeEscola("Jdev Treinamento");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de Programa��o");
		disciplina2.setNota(notaLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome Do Aluno = " + aluno.getNome() + " Inscrito no curso:" + aluno.getNomeEscola() );
		System.out.println("----->Disciplinas do Aluno<------");
		for(Disciplina disci: aluno.getDisciplinas()) {

			System.out.println("Disciplina: " + disci.getDisciplina());
			
			System.out.println("As Notas da disciplina s�o:");
			for(int pos = 0; pos < disci.getNota().length; pos++) {
				System.out.println("Nota: " + (pos +1) + " � igual: " + disci.getNota()[pos]); 
			
			}
		
		}		
		
	}	
	}	
		
	
	//String[] valores = {"Gustavo", "90", "Curso Java"};
	//for (int pos = 0 ; pos < valores.length; pos++) {
		//System.out.println("Valores na posi��o: " + (pos + 1) + " �= " + valores[pos]);
	//}		
		
		/*Array pode ser de todos os tipos de dados e objetos tamb�m*/
		
		
		//String posicoes = JOptionPane.showInputDialog("Quantas posi��es o Array deve ter?");
		
	
		/*array sempre deve ter a quantiadade de posi��es definidas*/	
	//double[] notas = new double[Integer.parseInt(posicoes)];
	
	
	//for(int pos = 0; pos < notas.length; pos++) {
		//String valor = JOptionPane.showInputDialog("Qual o Valor da Posi��o " + (pos +1) + " ?");
		//notas[pos] = Double.valueOf(valor);
			//}
	//for (int pos = 0 ; pos < notas.length; pos++) {
		//System.out.println("Nota: " + (pos + 1) + " �= " + notas[pos]);
	//}
